package org.ubiscript;

public interface Scriptable {

	// Fundamental
	public String getClassName();
	public void setPrototype(Scriptable prototype);
	public Scriptable getPrototype();
	public void setParentScope(Scriptable parentScope);
	public Scriptable getParentScope();
	public Scriptable lookup(String name);

	// for Object
	public boolean has(String name, Scriptable start);
	public Scriptable get(String name, Scriptable start);
	public int getAttribute(String name);
	public void put(String name, Scriptable value, int attribute);
	public boolean delete(String name);
	public String[] getNames();
	
	// for Array
	public Scriptable get(int index);
	public void put(int index, Scriptable value);
	public int getSize();
	
	// for Function
	public Scriptable call(Env env, Evaluator eval, Scriptable[] args, Scriptable thisObject) throws UbiException;
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException;
	
	// for Primitive
	public int toInt();
	public double toNumber();
	public String toString();
	public boolean toBoolean();
	
}
