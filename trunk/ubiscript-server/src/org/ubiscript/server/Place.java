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
	private Hashtable<String, UbiObject> remoteRefs;
	private UbiscriptHttpClient client;
	
	public Place(String location, String placeId) {
		this.location = location;
		this.placeId = placeId;
		interpreter = new Interpreter();
		remoteRefs = new Hashtable<String, UbiObject>();
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
	
	public String addRemoteRef(UbiObject obj) {
		// TODO refId의 길이를 줄이는 방법을 고려 (int를 사용)
		String refId = java.util.UUID.randomUUID().toString();
		remoteRefs.put(refId, obj);
		return refId;
	}
	
	public UbiObject getRemoteRef(String refId) {
		return remoteRefs.get(refId);
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
					String refId = items[3].trim();
					if (env.getCurrentScope().lookup(name) == null) {
						UbiNetRef ref = env.newNetRef(location, placeId, refId);
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
	
	public String get(String refId) {
		UbiObject obj = getRemoteRef(refId);
		StringWriter sw = new StringWriter();
		BufferedWriter writer = new BufferedWriter(sw);
		try {
			Marshaller.marshall(this, obj, writer, false);
		} catch (IOException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		}
		return sw.toString();
	}
	
	private class DelegateImpl implements EvaluatorDelegate {

		// TODO remote construct 도 구현하기.
		public UbiObject delegateCall(UbiNetRef ref, UbiObject[] args) {
			return null;
		}

		public void delegateExecute(NativePlace place, String[] names,
				UbiObject[] values, String code) {
			String freeVars = "";
			for (int i = 0; i < values.length; i++) {
				String refId = addRemoteRef(values[i]);
				freeVars = freeVars +
						names[i] + "," + location + "," + placeId + "," + refId + "\n";
			}
			client.execute(place.getLocation(), place.getPlaceId(), freeVars, code);			
		}

		public UbiObject delegateGet(UbiNetRef ref) {
			String result = client.get(ref.getLocation(), ref.getPlaceId(), ref.getRefId());
			StringReader sw = new StringReader(result);
			BufferedReader reader = new BufferedReader(sw);
			try {
				UbiObject obj = Marshaller.unmarshall(Place.this, reader);
				return obj;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		public void delegatePut(UbiNetRef ref, UbiObject value) {
			
		}
	}
}
