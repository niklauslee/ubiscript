package org.ubiscript;

public class NativeString extends NativeObject {

	public NativeString(Scriptable prototype, Env env) {
		super(prototype, env);
	}

	public static void init(Env env) {
		Scriptable obj = new NativeString(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_String, obj, Property.CONST);
	}

	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		Scriptable obj = env.newString(args[0].toString());
		return obj;
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}
}
