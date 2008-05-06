package org.ubiscript.server;

import java.util.Hashtable;
import org.ubiscript.Interpreter;

public class InterpreterManager {
	
	private Hashtable<String, Interpreter> interpreters;
	
	public InterpreterManager() {
		interpreters = new Hashtable<String, Interpreter>();
	}
	
	public Interpreter getInterpreter(String id) {
		return interpreters.get(id);
	}
}
