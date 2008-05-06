package org.ubiscript.server;

import java.util.Hashtable;

public class InterpreterManager {
	
	private Hashtable<String, InterpreterWrapper> interpreters;

	public InterpreterManager() {
		interpreters = new Hashtable<String, InterpreterWrapper>();
	}
	
}
