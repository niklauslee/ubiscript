package org.ubiscript;

import java.util.Vector;

// TODO equals, toString 등 구현하기. (이전에 UbiArray와 비교해 볼 것)

public class NativeArray extends NativeObject {

	private static final String
			Id_length = "length";
	
	private Vector<Scriptable> array;
	
	public NativeArray(Scriptable prototype, Environment env, int size, Scriptable[] values) {
		super(prototype, env);
		array = new Vector<Scriptable>();
		for (int i = 0; i < size; i++)
			if (values != null)
				array.add(values[i]);
			else
				array.add(env.getUndefined());
		Ids.add(Id_length);
	}
	
	public String getClassName() {
		return Constants.Id_Array;
	}

	public static void init(Environment env) {
		Scriptable obj = new NativeArray(null, env, 0, null);
		obj.put(Constants.Id_prototype, obj, Property.CONST);
		obj.put(Constants.Id_constructor, obj, Property.CONST);
		env.getRootScope().put(Constants.Id_Array, obj, Property.CONST);
	}

	public boolean canPut(int index) {
		return (index >= 0) && (index < array.size());
	}

	public boolean delete(int index) {
		if ((index >= 0) && (index < array.size())) {
			array.set(index, env.getUndefined());
			return true;
		}
		return false;
	}

	public Scriptable get(int index) {
		return array.get(index);
	}

	public int getAttribute(int index) {
		return Property.EMPTY;
	}

	public Scriptable get(String name, Scriptable start) {
		if (name.equals(Id_length))
			return env.newNumber(array.size());
		return super.get(name, start);
	}

	public void put(int index, Scriptable obj, int attribute) {
		array.set(index, obj);
	}
	
	public int getLength() {
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

	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
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
		Scriptable root = env.getRootScope();
		Scriptable obj = new NativeArray(root.get(Constants.Id_Array, root),
				env, size, (initialValuesProvided ? args : null)); 
		return obj;
	}

	public Scriptable invoke(Environment env, Evaluator eval, String name, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return env.getUndefined();
	}
}
