package org.ubiscript;

import java.util.ArrayList;

/**
 * Native Object.
 * A NativeObject plays the roles of both prototype and consturctor.
 * @author niklaus
 *
 */
public class NativeObject extends UbiObject {
	
	private static final String
			Id_toString = "toString";
	protected Environment env;
	protected ArrayList<String> Ids;

	public NativeObject(UbiObject prototype, Environment env) {
		super(prototype);
		this.env = env;
		Ids = new ArrayList<String>();
		Ids.add(Id_toString);
	}

	public static void init(Environment env) {
		UbiObject obj = new NativeObject(null, env);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Object, obj, Property.CONST);
	}
	
	public UbiObject get(String name) {
		if (Ids.contains(name))
			return new NativeObjectFunction(this, name);
		return super.get(name);
	}

	public boolean has(String name) {
		if (Ids.contains(name))
			return true;
		return super.has(name);
	}
	
	public int getAttribute(String name) {
		if (Ids.contains(name))
			return Property.CONST;
		return super.getAttribute(name);
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		if (name.equals(Id_toString)) {
			env.newString(thisObject.toString());
		}
		return env.getUndefined();
	}
	
	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		UbiObject obj = env.newObject();
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
		public UbiObject call(Environment env, Evaluator eval, UbiObject[] args, UbiObject thisObj) throws UbiException {
			return thisObject.invoke(env, eval, name, args, thisObject);
		}
	}
}
