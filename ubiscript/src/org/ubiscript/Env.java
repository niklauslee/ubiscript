package org.ubiscript;

import org.antlr.runtime.tree.*;

// TODO NativeJavaClass 구현하기
// TODO NativeActiveXObject 구현하기
// TODO NativeXMLObject 구현하기
// TODO NativeWebObject 구현하기

public class Env {
	
	private Scriptable currentScope;
	private Scriptable rootScope;
	private ProxyDelegate proxyDelegate;

	public Env() {
		initialize();
	}

	private void initialize() {
		// native objects
		NativeGlobal.init(this);
		NativeObject.init(this);
		NativeBoolean.init(this);
		NativeNumber.init(this);
		NativeString.init(this);
		NativeFunction.init(this);
		NativeArray.init(this);
		NativePlace.init(this);
		NativeJavaObject.init(this);
		currentScope = rootScope;
	}

	public Scriptable getCurrentScope() {
		return currentScope;
	}

	public Scriptable getRootScope() {
		return rootScope;
	}

	public void setRootScope(Scriptable obj) {
		rootScope = obj;
	}

	public void pushScope() {
		pushScope(newObject());
	}
	
	public void pushScope(Scriptable scope) {
		scope.setParentScope(currentScope);
		currentScope = scope;
	}

	public void popScope() {
		if (currentScope.getParentScope() != null) {
			currentScope = currentScope.getParentScope();
		}
	}
	
	public void setProxyDelegate(ProxyDelegate proxyDelegate) {
		this.proxyDelegate = proxyDelegate;
	}
	
	public ProxyDelegate getProxyDelegate() {
		return proxyDelegate;
	}
	
	public UbiObject newObject() {
		UbiObject o = new UbiObject(rootScope.get(Constants.Id_Object, rootScope));
		return o;
	}
	
	public UbiNumber newNumber(double value) {
		UbiNumber o = new UbiNumber(rootScope.get(Constants.Id_Number, rootScope), value);
		return o;
	}
	
	public UbiBoolean newBoolean(boolean value) {
		UbiBoolean o = new UbiBoolean(rootScope.get(Constants.Id_Boolean, rootScope), value);
		return o;
	}
	
	public UbiString newString(String value) {
		UbiString o = new UbiString(rootScope.get(Constants.Id_String, rootScope), value);
		return o;
	}
	
	public UbiFunction newFunction(String[] parameters, Tree bodyTree, String bodyCode) throws UbiException {
		UbiFunction o = new UbiFunction(rootScope.get(Constants.Id_Function, rootScope), parameters, bodyTree, bodyCode);
		Scriptable p = newObject();
		o.put(Constants.Id_prototype, p, Property.DONTDELETE);
		return o;
	}
	
	public UbiArray newArray(int size, Scriptable[] values) {
		UbiArray o = new UbiArray(rootScope.get(Constants.Id_Array, rootScope), size, values); 
		return o;
	}
	
	public UbiPlace newPlace(String location, String placeId) {
		UbiPlace o = new UbiPlace(rootScope.get(Constants.Id_Place, rootScope), location, placeId);
		return o;
	}
	
	public UbiReturn newReturn(Scriptable result) {
		return new UbiReturn(result);
	}
	
	public UbiBreak newBreak() {
		return new UbiBreak();
	}
	
	public UbiContinue newContinue() {
		return new UbiContinue();
	}
	
	public UbiRef newRef(Scriptable base, String name) {
		UbiRef o = new UbiRef(base, name);
		return o;
	}
	
	public UbiRef newRef(Scriptable base, int index) {
		UbiRef o = new UbiRef(base, index); 
		return o;
	}
	
	public ObjectProxy newObjectProxy(RemoteRef remoteRef) {
		ObjectProxy o = new ObjectProxy(remoteRef, proxyDelegate);
		return o;
	}
	
	public UbiNull getNull() {
		return UbiNull.getInstance();
	}
	
	public UbiUndefined getUndefined() {
		return UbiUndefined.getInstance();
	}
}
