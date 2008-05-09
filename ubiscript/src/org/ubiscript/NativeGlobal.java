package org.ubiscript;

// TODO global의 기본 함수(e.g. parseInt, ...)들 구현하기. (다른 native object들도 마찬가지)
public class NativeGlobal extends NativeObject {
	private static String
			Id_println = "println";
	
	public NativeGlobal(Scriptable prototype, Environment env) {
		super(prototype, env);
		Ids.add(Id_println);
	}

	public static void init(Environment env) {
		Scriptable obj = new NativeGlobal(null, env);
		env.setRootScope(obj);
		env.getRootScope().put(Constants.Id_global, obj, Property.PREDEFINED);
		env.getRootScope().put(Constants.Id_undefined, env.getUndefined(), Property.PREDEFINED);
	}

	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
		return env.getUndefined();
	}

	public Scriptable invoke(Environment env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		if (name.equals(Id_println)) {
			System.out.println(args[0].toString());
		}
		return env.getUndefined();
	}

}
