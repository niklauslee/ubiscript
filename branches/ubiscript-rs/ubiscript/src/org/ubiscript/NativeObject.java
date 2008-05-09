package org.ubiscript;

import java.util.ArrayList;

/**
 * Native Object.
 * A NativeObject plays the roles of both prototype and consturctor.
 * @author niklaus
 *
 */
public class NativeObject extends ScriptableObject {
	
	private static final String
			Id_toString = "toString";
	protected Environment env;
	protected ArrayList<String> Ids;

	public NativeObject(Scriptable prototype, Environment env) {
		super(prototype);
		this.env = env;
		Ids = new ArrayList<String>();
		Ids.add(Id_toString);
	}

	public static void init(Environment env) {
		Scriptable obj = new NativeObject(null, env);
		obj.put(Constants.Id_prototype, obj, Property.PREDEFINED);
		obj.put(Constants.Id_constructor, obj, Property.PREDEFINED);
		env.getRootScope().put(Constants.Id_Object, obj, Property.CONST);
	}
	
	public Scriptable get(String name, Scriptable start) {
		if (Ids.contains(name))
			return new NativeObjectFunction(this, name);
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

	public Scriptable invoke(Environment env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		if (name.equals(Id_toString)) {
			env.newString(thisObject.toString());
		}
		return env.getUndefined();
	}
	
	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
		Scriptable obj = env.newObject();
		return obj;
	}

	protected class NativeObjectFunction extends UbiFunction {
		private NativeObject thisObject;
		private String name;
		public NativeObjectFunction(NativeObject thisObject, String name) {
			super(null, null, null, null);
			this.thisObject = thisObject;
			this.name = name;
		}
		public Scriptable call(Environment env, Evaluator eval, Scriptable[] args, Scriptable thisObj) throws UbiException {
			return thisObject.invoke(env, eval, name, args, thisObject);
		}
	}
}
