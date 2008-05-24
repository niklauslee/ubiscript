package org.ubiscript;

public class NativePlace extends NativeScriptable {
	
	private static final String 
			DEFAULT_LOCATION = "http://127.0.0.1/";
	
	public NativePlace(Scriptable prototype, Env env) {
		super(prototype, env);
	}

	public static void init(Env env) {
		Scriptable obj = new NativePlace(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Place, obj, Property.CONST);
	}
	
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		String location = DEFAULT_LOCATION;
		if (args.length > 0)
			location = args[0].toString();
		return env.newPlace(location, null);
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}

}
