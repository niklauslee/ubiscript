package org.ubiscript;

import java.util.*;

public class UbiObject extends ScriptableObject {

	private Hashtable<String, Property> properties;

	public UbiObject(Scriptable prototype) {
		super(prototype);
		properties = new Hashtable<String, Property>();
	}
	
	public String getClassName() {
		return Constants.Id_Object;
	}
	
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
		return false;
	}

	public String[] getNames() {
		return properties.keySet().toArray(new String[0]);
	}

}
