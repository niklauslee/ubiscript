package org.ubiscript;

import java.util.*;

public class UbiObject {

	private Hashtable<String, Property> properties;
	private UbiObject prototype;
	private UbiObject parentScope;

	public UbiObject(UbiObject prototype) {
		properties = new Hashtable<String, Property>();
		this.parentScope = null;
		this.prototype = prototype;
	}
	
	public String getClassName() {
		return Constants.Id_Object;
	}
	
	public void setParentScope(UbiObject scope) {
		this.parentScope = scope;
	}
	
	public UbiObject getParentScope() {
		return parentScope;
	}
	
	public void setPrototype(UbiObject prototype) {
		this.prototype = prototype;
	}
	
	public UbiObject getPrototype() {
		return prototype;
	}
	
	public UbiObject get(String name) {
		Property prop = properties.get(name);
		if (prop != null)
			return prop.getValue();
		// find in prototype chain
		if (prototype != null)
			return prototype.get(name);
		return UbiUndefined.getInstance();
	}
	
	public UbiObject get(int index) {
		return UbiUndefined.getInstance();
	}
	
	public boolean canPut(String name) {
		if (properties.containsKey(name)) {
			Property prop = properties.get(name);
			return !prop.hasAttribute(Property.READONLY);
		}
		if (prototype != null)
			return prototype.canPut(name);
		return true;
	}
	
	public boolean canPut(int index) {
		return false;
	}
	
	public void put(String name, UbiObject obj, int attribute) {
		if (canPut(name)) {
			Property prop = properties.get(name);
			if (prop == null) {
				properties.put(name, new Property(name, obj, attribute));
			} else {
				prop.setValue(obj);
				prop.setAttribute(attribute);
			}
		}
	}
	
	public void put(int index, UbiObject obj, int attribute) {
		// do nothing.
	}
	
	public boolean has(String name) {
		if (properties.containsKey(name))
			return true;
		if (prototype == null)
			return false;
		return prototype.has(name);
	}
	
	public UbiObject lookup(String name) {
		if (has(name)) {
			return this;
		} else {
			if (parentScope != null) {
				return parentScope.lookup(name);
			} else {
				return null;
			}
		}
	}
	
	public boolean delete(String name) {
		Property prop = properties.get(name);
		if (prop == null)
			return true;
		if (prop.hasAttribute(Property.DONTDELETE))
			return false;
		properties.remove(name);
		return true;
	}
	
	public boolean delete(int index) {
		return true;
	}
	
	public UbiObject call(Environment env, Evaluator eval, UbiObject[] args, UbiObject thisObj) throws UbiException {
		throw new UbiException();
	}
	
	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		throw new UbiException();
	}
	
	public int getAttribute(String name) {
		Property prop = getProperty(name);
		return prop.getAttribute();
	}
	
	public int getAttribute(int index) {
		return Property.EMPTY;
	}
	
	public boolean toBoolean() {
		return true;
	}
	
	public double toNumber() {
		return 0.0d;
	}
	
	public int toInt() {
		return 0;
	}
	
	public String toString() {
		Enumeration<String> k = properties.keys();
		String s = "";
		while (k.hasMoreElements()) {
			String key = k.nextElement();
			s = s + key;
			if (k.hasMoreElements())
				s = s + ", ";
		}
		return "{" + s + "}";
	}
	
	public Property getProperty(String name) {
		return properties.get(name);
	}
	
	public Property getProperty(int index) throws UbiException {
		throw new UbiException();
	}
	
	public void putProperty(Property property) {
		properties.put(property.getName(), property);
	}
	
	public int getPropertyCount() {
		return properties.size();
	}
	
	public Enumeration<String> getPropertyNames() {
		return properties.keys();
	}
	
	public Property[] getProperties() {
		Collection<Property> collection = properties.values();
		return collection.toArray(new Property[0]);
	}
}
