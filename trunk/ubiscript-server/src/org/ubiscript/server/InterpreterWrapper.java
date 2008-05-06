package org.ubiscript.server;

import java.util.Hashtable;
import org.ubiscript.*;

public class InterpreterWrapper implements EvaluatorDelegate {
	
	private String url;
	private Interpreter interpreter;
	private Hashtable<String, UbiObject> remoteRefs;
	
	public InterpreterWrapper(String url) {
		this.url = url;
		interpreter = new Interpreter();
		interpreter.setEvaluatorDelegate(this);
		remoteRefs = new Hashtable<String, UbiObject>();
	}
	
	public Interpreter getInterpreter() {
		return interpreter;
	}
	
	public UbiObject delegateCall(UbiNetRef ref, UbiObject[] args) {
		return null;
	}

	public void delegateExecute(NativePlace place, String[] vars,
			UbiObject[] values, String code) {
		String encodedVars = "";
		for (int i = 0; i < values.length; i++) {
			String id = java.util.UUID.randomUUID().toString();
			encodedVars = encodedVars + 
					url + "," + vars[i] + "," + id + "\n";
			remoteRefs.put(id, values[i]);
		}
		UbiscriptHttpClient client = new UbiscriptHttpClient();
		client.execute(place.getLocation(), encodedVars, code);
	}

	public UbiObject delegateGet(UbiNetRef ref) {
		return null;
	}

	public void delegatePut(UbiNetRef ref, UbiObject value) {
		
	}	
	
}
