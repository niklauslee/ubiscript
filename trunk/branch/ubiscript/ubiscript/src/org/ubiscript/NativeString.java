package org.ubiscript;

public class NativeString extends NativeObject {

	public NativeString(UbiObject prototype, Environment env) {
		super(prototype, env);
	}

	public static void init(Environment env) {
		UbiObject obj = new NativeString(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_String, obj, Property.CONST);
	}

	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		UbiObject obj = env.newString(args[0].toString());
		return obj;
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}
}
