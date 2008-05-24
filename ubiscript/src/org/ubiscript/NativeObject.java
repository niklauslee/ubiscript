package org.ubiscript;

import java.util.ArrayList;

/**
 * Native Object.
 * A NativeObject plays the roles of both prototype and consturctor.
 * @author niklaus
 *
 */
public class NativeObject extends NativeScriptable {
	
	public NativeObject(Scriptable prototype, Env env) {
		super(prototype, env);
	}

	public static void init(Env env) {
		Scriptable obj = new NativeObject(null, env);
		obj.put(Constants.Id_prototype, obj, Property.PREDEFINED);
		obj.put(Constants.Id_constructor, obj, Property.PREDEFINED);
		env.getRootScope().put(Constants.Id_Object, obj, Property.CONST);
	}

}
