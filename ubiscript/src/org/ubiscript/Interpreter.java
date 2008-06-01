package org.ubiscript;

/**
 * A Ubiscript Embeddable Interpreter
 * @author niklaus
 */
public class Interpreter {

	private Env env;
	private Evaluator evaluator;

	public Interpreter() {
		evaluator = new Evaluator();
		env = new Env();
	}

	public Env getEnv() {
		return env;
	}

	public Evaluator getEvaluator() {
		return evaluator;
	}
	
	public Scriptable get(String name) {
		return env.getCurrentScope().get(name, env.getCurrentScope());
	}
	
	public void execute(String code) throws UbiException {
		evaluator.evaluateStatement(env, code);
	}
	
	public Scriptable evaluate(String code) throws UbiException {
		return evaluator.evaluateExpression(env, code);
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
