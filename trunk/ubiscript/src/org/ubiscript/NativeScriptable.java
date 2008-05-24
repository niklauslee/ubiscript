package org.ubiscript;

import java.util.ArrayList;

public class NativeScriptable extends ScriptableObject {

	private static final String
			Id_toString = "toString";
	protected Env env;
	protected ArrayList<String> Ids;

	public NativeScriptable(Scriptable prototype, Env env) {
		super(prototype);
		this.env = env;
		Ids = new ArrayList<String>();
		Ids.add(Id_toString);
	}
	
	public Scriptable get(String name, Scriptable start) {
		if (Ids.contains(name))
			return new NativeScriptableFunction(this, name);
		return super.get(name, start);
	}

	public boolean has(String name, Scriptable start) {
		if (Ids.contains(name))
			return true;
		return super.has(name, start);
	}
	
	public int getAttribute(String name) {
		if (Ids.contains(name))
			return Property.CONST;
		return super.getAttribute(name);
	}

	public Scriptable invoke(Env env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		if (name.equals(Id_toString)) {
			env.newString(thisObject.toString());
		}
		return env.getUndefined();
	}
	
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		Scriptable obj = env.newObject();
		return obj;
	}

	protected class NativeScriptableFunction extends UbiFunction {
		private NativeScriptable thisObject;
		private String name;
		public NativeScriptableFunction(NativeScriptable thisObject, String name) {
			super(null, null, null, null);
			this.thisObject = thisObject;
			this.name = name;
		}
		public Scriptable call(Env env, Evaluator eval, Scriptable[] args, Scriptable thisObj) throws UbiException {
			return thisObject.invoke(env, eval, name, args, thisObject);
		}
	}
	
}
