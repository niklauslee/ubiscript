package org.ubiscript;

import java.util.Vector;

public class UbiArray extends ScriptableObject {

	private static final String
			Id_length = "length";
	
	private Vector<Scriptable> array;

	public UbiArray(Scriptable prototype, int size, Scriptable[] values) {
		super(prototype);
		array = new Vector<Scriptable>();
		for (int i = 0; i < size; i++)
			if (values != null)
				array.add(values[i]);
			else
				array.add(UbiUndefined.getInstance());
		// Ids.add(Id_length);
	}
	
	public int getLength() {
		return array.size();
	}

	public String getClassName() {
		return Constants.Id_Array;
	}

	

}
