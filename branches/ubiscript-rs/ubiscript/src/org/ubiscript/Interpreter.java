package org.ubiscript;

/**
 * A Ubiscript Embeddable Interpreter
 * @author niklaus
 */
public class Interpreter {

	private Environment env;
	private Evaluator evaluator;

	public Interpreter() {
		evaluator = new Evaluator();
		try {
			env = new Environment();
		} catch (UbiException e) {
			e.printStackTrace();
		}
	}

	public void execute(String code) throws UbiException {
		evaluator.evaluateStatement(env, code);
	}

	public void put(String name, UbiObject obj) {
		env.getRootScope().put(name, obj, Property.EMPTY);
	}

	public UbiObject get(String name) {
		return env.getRootScope().get(name);
	}
	
	public Environment getEnv() {
		return env;
	}
	
	public void setEvaluatorDelegate(EvaluatorDelegate delegate) {
		evaluator.setEvaluatorDelegate(delegate);
	}
	
	public EvaluatorDelegate getEvaluatorDelegate() {
		return evaluator.getEvaluatorDelegate();
	}

}
