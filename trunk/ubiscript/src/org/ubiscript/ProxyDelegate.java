package org.ubiscript;

public interface ProxyDelegate {
	// for Object
	public Scriptable get(RemoteRef remoteRef, String name);	
	public void put(RemoteRef remoteRef, String name, Scriptable obj);
	public boolean delete(RemoteRef remoteRef, String name);

	// for Array
	public Scriptable get(RemoteRef remoteRef, int index);
	public void put(RemoteRef remoteRef, int index, Scriptable obj);

	// for Function
	public Scriptable call(RemoteRef remoteRef, Scriptable[] args, Scriptable thisObj);
	public Scriptable construct(RemoteRef remoteRef, Scriptable[] args);
	
}
