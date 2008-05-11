package org.ubiscript;

public class ObjectProxy extends ScriptableObject {

	private String className;
	private RemoteRef remoteRef;
	private ProxyDelegate proxyDelegate;
	
	public ObjectProxy(String className, RemoteRef remoteRef, 
			ProxyDelegate proxyDelegate) {
		super(null);
		this.className = className;
		this.remoteRef = remoteRef;
		this.proxyDelegate = proxyDelegate;
	}
	
	public String getClassName() {
		return className;
	}

	public RemoteRef getRemoteRef() {
		return remoteRef;
	}
	
	public boolean has(String name, Scriptable start) {
		// TODO implement this.
		return true;
	}

	public Scriptable get(String name, Scriptable start) {
		return proxyDelegate.get(remoteRef, name);
	}
	
	public void put(String name, Scriptable obj, int attribute) {
		proxyDelegate.put(remoteRef, name, obj);
	}

	public boolean delete(String name) {
		return proxyDelegate.delete(remoteRef, name);
	}
	
	public String[] getNames() {
		// TODO implement this.
		return null;
	}
	
	public Scriptable get(int index) {
		return proxyDelegate.get(remoteRef, index);
	}
	
	public void put(int index, Scriptable obj) {
		proxyDelegate.put(remoteRef, index, obj);
	}
	
	public int getSize() {
		// TODO implement this.
		return 0;
	}
	
	public Scriptable call(Env env, Evaluator eval, Scriptable[] args,
			Scriptable thisObj) throws UbiException {
		return proxyDelegate.call(remoteRef, args, thisObj);
	}

	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args)
			throws UbiException {
		return proxyDelegate.construct(remoteRef, args);
	}
	
	public int toInt() {		
		// TODO implement this.
		return 0;
	}
	
	public double toNumber() {
		// TODO implement this.
		return 0.0d;
	}
	
	public String toString() {
		// TODO implement this.
		return null;
	}
	
	public boolean toBoolean() {
		// TODO implement this.
		return false;
	}
}
