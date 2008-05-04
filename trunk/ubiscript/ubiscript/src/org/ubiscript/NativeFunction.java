package org.ubiscript;

public class NativeFunction extends NativeObject {

	public NativeFunction(UbiObject prototype, Environment env) {
		super(prototype, env);
	}

	public static void init(Environment env) {
		UbiObject obj = new NativeFunction(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Function, obj, Property.CONST);
	}

	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		String[] parameters = null;
		String body = null;
		if (args.length > 1) {
			parameters = new String[args.length - 1];
			for (int i = 0; i < (args.length - 1); i++)
				parameters[i] = args[i].toString();
		}
		if (args.length > 0)
			body = args[args.length - 1].toString();
		UbiObject obj = env.newFunction(parameters, null, body);
		return obj;
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}
}
