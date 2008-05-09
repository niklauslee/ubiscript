package org.ubiscript;


/*

class ObjectProxy {
	String location;
	String exportId;
	ProxyDelegate proxyDelegate;
	public void put(String name, UbiObject value);
	public void put(int index, UbiObject value);
	public UbiObject get(String name);
	public UbiObject get(int index);
	public UbiObject call(Environment env, Evaluator eval, UbiObject[] args, UbiObject thisObj);
	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args);
}

interface ProxyDelegate {
	public void put(String location, String exportId, String name, UbiObject value);
	public void put(String location, String exportId, int index, UbiObject value);
	public UbiObject get(String location, String exportId, String name);
	public UbiObject get(String location, String exportId, int index);
	public UbiObject call(String location, String exportId, UbiObject[] args);
	public UbiObject construct(String location, String exportId, UbiObject[] args);
}

class Environment {
	public ActivationProxy newActivationProxy(ProxyDelegate proxyDelegate, 
			String location);
	public ObjectProxy newObjectProxy(ProxyDelegate proxyDelegate,
			String location, String exportId);
}

class Interpreter {
	Hashtable<Long, UbiObject> exportedObjects;
	
	public long export(UbiObject);
	public UbiObject getExportedObject(long exportId);
	
	public void pushScope(...); // pushScope(env.newActivationProxy(location));
	public void popScope();
	public execute(String code);
	public 
}

interface InterpreterDelegate {
	public String getCurrentLocation();
	public void execute(NativePlace place, String[] freeVars, String code);
	public void  
	
}


 */


/**
 * A Ubiscript Embeddable Interpreter
 * @author niklaus
 */
public class Interpreter {

	private Env env;
	private Evaluator evaluator;

	public Interpreter() {
		evaluator = new Evaluator();
		try {
			env = new Env();
		} catch (UbiException e) {
			e.printStackTrace();
		}
	}

	public void execute(String code) throws UbiException {
		evaluator.evaluateStatement(env, code);
	}

	public void put(String name, Scriptable obj) {
		env.getRootScope().put(name, obj, Property.EMPTY);
	}

	public Scriptable get(String name, Scriptable start) {
		return env.getRootScope().get(name, start);
	}
	
	public Env getEnv() {
		return env;
	}
	
	public void setEvaluatorDelegate(EvaluatorDelegate delegate) {
		evaluator.setEvaluatorDelegate(delegate);
	}
	
	public EvaluatorDelegate getEvaluatorDelegate() {
		return evaluator.getEvaluatorDelegate();
	}

}
