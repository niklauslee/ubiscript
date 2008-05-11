package org.ubiscript;

import java.util.Hashtable;

/**
 * A Ubiscript Embeddable Interpreter
 * @author niklaus
 */
public class Interpreter {

	private Env env;
	private Evaluator evaluator;
	private long exportCount;
	private Hashtable<Long, Scriptable> exportedObjects;

	public Interpreter() {
		evaluator = new Evaluator();
		env = new Env();
		exportCount = 0;
		exportedObjects = new Hashtable<Long, Scriptable>();
	}

	public Env getEnv() {
		return env;
	}

	public Evaluator getEvaluator() {
		return evaluator;
	}
	
	public void execute(String code) throws UbiException {
		evaluator.evaluateStatement(env, code);
	}
	
	public long exportObject(Scriptable obj) {
		exportedObjects.put(exportCount, obj);
		exportCount++;
		return exportCount;
	}
	
	public Scriptable getExportedObject(long id) {
		return exportedObjects.get(id);
	}
	
	public void setProxyDelegate(ProxyDelegate proxyDelegate) {
		env.setProxyDelegate(proxyDelegate);
	}
	
	public ProxyDelegate getProxyDelegate() {
		return env.getProxyDelegate();
	}
	
	public void setEvaluatorDelegate(EvaluatorDelegate delegate) {
		evaluator.setEvaluatorDelegate(delegate);
	}
	
	public EvaluatorDelegate getEvaluatorDelegate() {
		return evaluator.getEvaluatorDelegate();
	}

}
