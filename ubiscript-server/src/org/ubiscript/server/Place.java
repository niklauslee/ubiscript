package org.ubiscript.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.ubiscript.*;

/**
 * A Place. 
 * A place is responsible for managing remote references, provides delegate handler,
 * and serialize and de-serialize objects via network.
 * @author niklaus
 */
public class Place {
	
	private String location;
	private String placeId;
	private Interpreter interpreter;
	private Hashtable<String, Scriptable> remoteRefs;
	private UbiscriptHttpClient client;
	
	public Place(String location, String placeId) {
		this.location = location;
		this.placeId = placeId;
		interpreter = new Interpreter();
		remoteRefs = new Hashtable<String, Scriptable>();
		client = new UbiscriptHttpClient();
		interpreter.setEvaluatorDelegate(new DelegateImpl());
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public Interpreter getInterpreter() {
		return interpreter;
	}
	
	public String addRemoteRef(Scriptable obj) {
		// TODO baseId의 길이를 줄이는 방법을 고려 (int를 사용)
		String id = java.util.UUID.randomUUID().toString();
		remoteRefs.put(id, obj);
		return id;
	}
	
	public Scriptable getRemoteRef(String id) {
		return remoteRefs.get(id);
	}
	
	public String execute(String freeVars, String code) {
		try {
			Environment env = interpreter.getEnv();
			env.pushScope();
			if (freeVars != null) {
				// decoding free variables
				freeVars = freeVars.trim();
				String[] lines = freeVars.split("\n");
				for (int i = 0; i < lines.length; i++) {
					String line = lines[i].trim();
					String[] items = line.split(",");
					String name = items[0].trim();
					String location = items[1].trim();
					String placeId = items[2].trim();
					String baseId = items[3].trim();
					if (env.getCurrentScope().lookup(name) == null) {
						UbiNetRef ref = env.newNetRef(location, placeId, baseId, name);
						env.getCurrentScope().put(name, ref, Property.DONTDELETE);
					}
				}
			}
			interpreter.execute(code);
			env.popScope();
			return "OK";
		} catch (UbiException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
	}
	
	public String get(String baseId, int nameOrIndex, String name, int index) {
		Scriptable base = getRemoteRef(baseId);
		Scriptable obj = null;
		if (nameOrIndex == UbiAbstractRef.REF_BY_NAME)
			obj = base.get(name);
		else
			obj = base.get(index);
		StringWriter sw = new StringWriter();
		BufferedWriter writer = new BufferedWriter(sw);
		try {
			Marshaller.marshall(this, obj, writer, false, null, -1, null, -1);
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
		return sw.toString();
	}
	
	public String put(String baseId, int nameOrIndex, String name, int index, String encodedValue) {
		Scriptable base = getRemoteRef(baseId);
		StringReader sr = new StringReader(encodedValue);
		BufferedReader reader = new BufferedReader(sr);
		Scriptable obj;
		try {
			obj = Marshaller.unmarshall(this, reader);
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
		if (nameOrIndex == UbiAbstractRef.REF_BY_NAME)
			base.put(name, obj, Property.EMPTY);
		else
			base.put(index, obj, Property.EMPTY);
		return "OK";
	}
	
	private class DelegateImpl implements EvaluatorDelegate {

		// TODO remote construct 도 구현하기.
		public Scriptable delegateCall(UbiNetRef ref, Scriptable[] args) {
			return null;
		}

		public void delegateExecute(NativePlace place, String[] names,
				Scriptable[] bases, String code) {
			String freeVars = "";
			for (int i = 0; i < bases.length; i++) {
				String baseId = addRemoteRef(bases[i]);
				freeVars = freeVars +
						names[i] + "," + location + "," + placeId + "," + baseId + "\n";
			}
			String result = client.execute(place.getLocation(), place.getPlaceId(), freeVars, code);			
		}

		public Scriptable delegateGet(UbiNetRef ref) {
			// TODO get 할 때, primitive 면 값을 가져오고, 아니면 객체의 netRef를 가져오는게 맞는거 아닌가?
			/*
			 * 현재 상태의 get, put이 맞지 않는 사례. (아직 테스트가 안됨. 좀 더 기다릴 것.)
			 * var x = new Array("a", "b", "c");
			 * var p = new Place("...");
			 * on (p) {
			 *   println(x[1]); // "b" (x 배열의 shallow copy가 전송되어 옴.)
			 *   x[1] = "z";
			 *   println(x[1]); // "z" (x 배열의 shallow copy가 변경됨)
			 * }
			 * println(x[1]); // "b" (p 장소 내부에서만 변경이 일어나서, 원래 x[1]이 그대로 남아있음.
			 */
			String result = client.get(ref.getLocation(), ref.getPlaceId(), 
					ref.getBaseId(), ref.getNameOrIndex(), ref.getName(), ref.getIndex());
			StringReader sw = new StringReader(result);
			BufferedReader reader = new BufferedReader(sw);
			try {
				Scriptable obj = Marshaller.unmarshall(Place.this, reader);
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		public void delegatePut(UbiNetRef ref, Scriptable value) {
			// TODO put 할 때, value가 primitive 이면 값을 전달하고, 아니면 객체의 netRef를 전달하는게 맞는게 아닌가?
			StringWriter sw = new StringWriter();
			BufferedWriter writer = new BufferedWriter(sw);
			try {
				Marshaller.marshall(Place.this, value, writer, false, null, -1, null, -1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String encodedValue = sw.toString();
			String result = client.put(ref.getLocation(), ref.getPlaceId(), 
					ref.getBaseId(), ref.getNameOrIndex(), ref.getName(), ref.getIndex(), 
					encodedValue);
		}
	}
}
