package org.ubiscript;

public class ScriptableObject implements Scriptable {

	protected Scriptable prototype;
	protected Scriptable parentScope;

	public ScriptableObject(Scriptable prototype) {
		this.prototype = prototype;
		parentScope = null;
	}
	
	public String getClassName() {
		return null;
	}

	public void setPrototype(Scriptable prototype) {
		this.prototype = prototype;
	}

	public Scriptable getPrototype() {
		return prototype;
	}

	public void setParentScope(Scriptable parentScope) {
		this.parentScope = parentScope;
	}

	public Scriptable getParentScope() {
		return parentScope;
	}
	
	public Scriptable lookup(String name) {
		if (has(name, this)) {
			return this;
		} else {
			if (parentScope != null) {
				return parentScope.lookup(name);
			} else {
				return null;
			}
		}
	}

	// for Object
	public boolean has(String name, Scriptable start) {
		return false;
	}
	
	public Scriptable get(String name, Scriptable start) {
		return null;
	}
	
	public int getAttribute(String name) {
		return Property.EMPTY;
	}
	
	public void put(String name, Scriptable value, int attribute) {
		// do nothing.
	}
	
	public boolean delete(String name) {
		return false;
	}
	
	public String[] getNames() {
		return null;
	}
	
	// for Array
	public Scriptable get(int index) {
		return null;
	}
	
	public void put(int index, Scriptable value) {
		// do nothing.
	}
	
	public int getSize() {
		return 0;
	}
	
	// for Function
	public Scriptable call(Environment env, Evaluator eval, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return null;
	}
	
	public Scriptable construct(Environment env, Evaluator eval, Scriptable[] args) throws UbiException {
		return null;
	}

	public int toInt() {
		return 0;
	}
	
	public double toNumber() {
		return 0.0d;
	}
	
	public String toString() {
		return null;
	}
	
	public boolean toBoolean() {
		return false;
	}
	
}
