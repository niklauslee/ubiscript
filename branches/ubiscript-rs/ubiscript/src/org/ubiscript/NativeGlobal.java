package org.ubiscript;

// TODO global의 기본 함수(e.g. parseInt, ...)들 구현하기. (다른 native object들도 마찬가지)
public class NativeGlobal extends NativeObject {
	private static String
			Id_println = "println";
	
	public NativeGlobal(UbiObject prototype, Environment env) {
		super(prototype, env);
		Ids.add(Id_println);
	}

	public static void init(Environment env) {
		UbiObject obj = new NativeGlobal(null, env);
		env.setRootScope(obj);
		env.getRootScope().put(Constants.Id_global, obj, Property.PREDEFINED);
		env.getRootScope().put(Constants.Id_undefined, env.getUndefined(), Property.PREDEFINED);
	}

	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		return env.getUndefined();
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		if (name.equals(Id_println)) {
			System.out.println(args[0].toString());
		}
		return env.getUndefined();
	}

}
