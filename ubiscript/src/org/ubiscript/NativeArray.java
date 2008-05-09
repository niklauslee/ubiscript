package org.ubiscript;

public class NativeArray extends NativeScriptable {

	private static final String
			Id_length = "length";
	
	public NativeArray(Scriptable prototype, Env env, int size, Scriptable[] values) {
		super(prototype, env);
		Ids.add(Id_length);
	}
	
	public String getClassName() {
		return Constants.Id_Array;
	}

	public static void init(Env env) {
		Scriptable obj = new NativeArray(null, env, 0, null);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Array, obj, Property.CONST);
	}

	public Scriptable get(String name, Scriptable start) {
		if (name.equals(Id_length)) {
			if (start instanceof UbiArray) {
				UbiArray arr = (UbiArray) start;
				return env.newNumber(arr.getSize());
			}
		}
		return super.get(name, start);
	}

	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		int size = 0;
		boolean initialValuesProvided = false;
		if (args.length > 0) {
			if ((args.length == 1) && (args[0] instanceof UbiNumber)) {
				size = args[0].toInt();
			} else {
				size = args.length;
				initialValuesProvided = true;
			}
		}
		Scriptable obj = env.newArray(size, (initialValuesProvided ? args : null)); 
		return obj;
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}
}
