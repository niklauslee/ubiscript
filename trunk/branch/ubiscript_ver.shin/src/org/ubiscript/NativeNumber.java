package org.ubiscript;

public class NativeNumber extends NativeObject {

	public NativeNumber(UbiObject prototype, Environment env) {
		super(prototype, env);
	}

	public static void init(Environment env) {
		UbiObject obj = new NativeNumber(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Number, obj, Property.CONST);
	}

	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		UbiObject obj = env.newNumber(args[0].toNumber());
		return obj;
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}
}
