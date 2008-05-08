package org.ubiscript;

import java.util.Vector;

// TODO equals, toString 등 구현하기. (이전에 UbiArray와 비교해 볼 것)

public class NativeArray extends NativeObject {

	private static final String
			Id_length = "length";
	
	private Vector<UbiObject> array;
	
	public NativeArray(UbiObject prototype, Environment env, int size, UbiObject[] values) {
		super(prototype, env);
		array = new Vector<UbiObject>();
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
		UbiObject obj = new NativeArray(null, env, 0, null);
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

	public UbiObject get(int index) {
		return array.get(index);
	}

	public int getAttribute(int index) {
		return Property.EMPTY;
	}

	public UbiObject get(String name) {
		if (name.equals(Id_length))
			return env.newNumber(array.size());
		return super.get(name);
	}

	public void put(int index, UbiObject obj, int attribute) {
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

	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
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
		UbiObject obj = new NativeArray(env.getRootScope().get(Constants.Id_Array),
				env, size, (initialValuesProvided ? args : null)); 
		return obj;
	}

	public UbiObject invoke(Environment env, Evaluator eval, String name, UbiObject[] args, UbiObject thisObject) throws UbiException {
		return env.getUndefined();
	}
}
