package org.ubiscript;

// TODO global의 기본 함수(e.g. parseInt, ...)들 구현하기. (다른 native object들도 마찬가지)
public class NativeGlobal extends NativeScriptable {
	private static String
			Id_println = "println";
	
	public NativeGlobal(Scriptable prototype, Env env) {
		super(prototype, env);
		Ids.add(Id_println);
	}

	public static void init(Env env) {
		Scriptable obj = new NativeGlobal(null, env);
		env.setRootScope(obj);
		env.getRootScope().put(Constants.Id_global, obj, Property.PREDEFINED);
		env.getRootScope().put(Constants.Id_undefined, env.getUndefined(), Property.PREDEFINED);
	}

	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		return env.getUndefined();
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		if (name.equals(Id_println)) {
			System.out.println(args[0].toString());
		}
		return env.getUndefined();
	}

}
