package org.ubiscript;

public class NativeNumber extends NativeObject {

	public NativeNumber(Scriptable prototype, Environment env) {
		super(prototype, env);
	}

	public static void init(Environment env) {
		Scriptable obj = new NativeNumber(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Number, obj, Property.CONST);
	}

	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
		Scriptable obj = env.newNumber(args[0].toNumber());
		return obj;
	}

	public Scriptable invoke(Environment env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}
}
