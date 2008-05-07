package org.ubiscript.server;

import java.util.Hashtable;
import org.ubiscript.*;

/**
 * A Place. 
 * @author niklaus
 */
public class Place {
	
	private String url;
	private String id;
	private Interpreter interpreter;
	private Hashtable<String, UbiObject> remoteRefs;
	private UbiscriptHttpClient client;
	
	public Place(String url, String id) {
		this.url = url;
		this.id = id;
		interpreter = new Interpreter();
		remoteRefs = new Hashtable<String, UbiObject>();
		client = new UbiscriptHttpClient();
		interpreter.setEvaluatorDelegate(new DelegateImpl());
	}
	
	public void execute(String freeVars, String code) {
		try {
			Environment env = interpreter.getEnv();
			//env.pushScope();
			if (freeVars != null) {
				// decoding free variables
				freeVars = freeVars.trim();
				if (freeVars != null) {
					String[] lines = freeVars.split("\n");
					for (int i = 0; i < lines.length; i++) {
						String line = lines[i].trim();
						String[] items = line.split(",");
						String name = items[0].trim();
						String url = items[1].trim();
						String placeId = items[2].trim();
						String refId = items[3].trim();
						UbiNetRef ref = env.newNetRef(url, placeId, refId);
						env.getCurrentScope().put(name, ref, Property.DONTDELETE);
					}
				}

				System.out.println(freeVars);
				
			}
			interpreter.execute(code);
			//env.popScope();
		} catch (UbiException e) {
			e.printStackTrace();
		}
	}
	
	private class DelegateImpl implements EvaluatorDelegate {

		public UbiObject delegateCall(UbiNetRef ref, UbiObject[] args) {
			return null;
		}

		public void delegateExecute(NativePlace place, String[] names,
				UbiObject[] values, String code) {
			String freeVars = "";
			for (int i = 0; i < values.length; i++) {
				String refId = java.util.UUID.randomUUID().toString();
				freeVars = freeVars + 
						names[i] + "," + url + "," + id + "," + refId + "\n";
				remoteRefs.put(refId, values[i]);
			}
			client.execute(place.getLocation(), place.getPlaceId(), freeVars, code);			
		}

		public UbiObject delegateGet(UbiNetRef ref) {
			return null;
		}

		public void delegatePut(UbiNetRef ref, UbiObject value) {
			
		}
	}
}
