package org.ubiscript;

public class UbiObject extends ScriptableObject {

	public UbiObject(Scriptable prototype) {
		super(prototype);
	}
	
	public String getClassName() {
		return Constants.Id_Object;
	}

}
