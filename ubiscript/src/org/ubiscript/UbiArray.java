package org.ubiscript;

import java.util.Vector;

public class UbiArray extends ScriptableObject {

	private Vector<Scriptable> array;

	public UbiArray(Scriptable prototype, int size, Scriptable[] values) {
		super(prototype);
		array = new Vector<Scriptable>();
		for (int i = 0; i < size; i++)
			if (values != null)
				array.add(values[i]);
			else
				array.add(UbiUndefined.getInstance());
	}

	public String getClassName() {
		return Constants.Id_Array;
	}

	public Scriptable get(int index) {
		return array.get(index);
	}

	public void put(int index, Scriptable obj) {
		array.set(index, obj);
	}
	
	public int getSize() {
		return array.size();
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < array.size(); i++) {
			if (i > 0) s = s + ",";
			s = s + array.get(i).toString();
		}
		return "[" + s + "]";
	}
}
