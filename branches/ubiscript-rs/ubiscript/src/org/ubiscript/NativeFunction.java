package org.ubiscript;

public class NativeFunction extends NativeScriptable {

	public NativeFunction(Scriptable prototype, Env env) {
		super(prototype, env);
	}

	public static void init(Env env) {
		Scriptable obj = new NativeFunction(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Function, obj, Property.CONST);
	}

	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		String[] parameters = null;
		String body = null;
		if (args.length > 1) {
			parameters = new String[args.length - 1];
			for (int i = 0; i < (args.length - 1); i++)
				parameters[i] = args[i].toString();
		}
		if (args.length > 0)
			body = args[args.length - 1].toString();
		Scriptable obj = env.newFunction(parameters, null, body);
		return obj;
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}
}
