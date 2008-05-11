package org.ubiscript;

import java.util.Hashtable;

public class ScriptableObject implements Scriptable {

	protected Scriptable prototype;
	protected Scriptable parentScope;
	private Hashtable<String, Property> properties;

	public ScriptableObject(Scriptable prototype) {
		this.prototype = prototype;
		parentScope = null;
		properties = new Hashtable<String, Property>();
	}
	
	public String getClassName() {
		return Constants.Id_Object;
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

	// for Object -------------------------------------------------------------
	
	public boolean has(String name, Scriptable start) {
		if (properties.containsKey(name))
			return true;
		if (prototype != null)
			return prototype.has(name, start);
		return false;
	}

	public Scriptable get(String name, Scriptable start) {
		Property prop = properties.get(name);
		if (prop != null)
			return prop.getValue();
		if (prototype != null)
			return prototype.get(name, start);
		return UbiUndefined.getInstance();
	}
	
	public int getAttribute(String name) {
		Property prop = properties.get(name);
		if (prop != null) {
			return prop.getAttribute();
		}
		if (prototype != null)
			return prototype.getAttribute(name);
		return Property.EMPTY;
	}
			
	public void put(String name, Scriptable obj, int attribute) {
		Property prop = properties.get(name);
		if (prop == null) {
			properties.put(name, new Property(name, obj, attribute));
		} else {
			if (!prop.hasAttribute(Property.READONLY)) {
				prop.setValue(obj);
				prop.setAttribute(attribute);
			}
		}
	}
	
	public boolean delete(String name) {
		Property prop = properties.get(name);
		if (prop != null) {
			if (prop.hasAttribute(Property.DONTDELETE))
				return false;
			else {
				properties.remove(name);
				return true;
			}
		}
		return true;
	}

	public String[] getNames() {
		return properties.keySet().toArray(new String[0]);
	}
	
	// for Array --------------------------------------------------------------
	
	public Scriptable get(int index) {
		return null;
	}
	
	public void put(int index, Scriptable value) {
		// do nothing.
	}
	
	public int getSize() {
		return 0;
	}
	
	// for Function -----------------------------------------------------------
	
	public Scriptable call(Env env, Evaluator eval, Scriptable[] args, Scriptable thisObject) throws UbiException {
		return null;
	}
	
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
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
