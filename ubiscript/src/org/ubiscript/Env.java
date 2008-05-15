package org.ubiscript;

import org.antlr.runtime.tree.*;

// TODO NativeActiveXObject 구현하기
// TODO NativeXMLObject 구현하기
// TODO NativeWebObject 구현하기

public class Env {
	
	private Scriptable currentScope;
	private Scriptable rootScope;
	private Scriptable globalObject;
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
		NativeJavaClass.init(this);
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
	
	public void pushRootScope(Scriptable scope) {
		rootScope.setParentScope(scope);
		rootScope = scope;
	}
	
	public void popRootScope() {
		Scriptable scope = currentScope;
		if (scope != rootScope) {
			while (scope.getParentScope() == rootScope)
				scope = scope.getParentScope();
		}
		rootScope = scope;
		rootScope.setParentScope(null);
	}
	
	public void setGlobalObject(Scriptable obj) {
		globalObject = obj;
	}
	
	public Scriptable getGlobalObject() {
		return globalObject;
	}
	
	public void setProxyDelegate(ProxyDelegate proxyDelegate) {
		this.proxyDelegate = proxyDelegate;
	}
	
	public ProxyDelegate getProxyDelegate() {
		return proxyDelegate;
	}
	
	public UbiObject newObject() {
		UbiObject o = new UbiObject(globalObject.get(Constants.Id_Object, globalObject));
		return o;
	}
	
	public UbiNumber newNumber(double value) {
		UbiNumber o = new UbiNumber(globalObject.get(Constants.Id_Number, globalObject), value);
		return o;
	}
	
	public UbiBoolean newBoolean(boolean value) {
		UbiBoolean o = new UbiBoolean(globalObject.get(Constants.Id_Boolean, globalObject), value);
		return o;
	}
	
	public UbiString newString(String value) {
		UbiString o = new UbiString(globalObject.get(Constants.Id_String, globalObject), value);
		return o;
	}
	
	public UbiFunction newFunction(String[] parameters, Tree bodyTree, String bodyCode) throws UbiException {
		UbiFunction o = new UbiFunction(globalObject.get(Constants.Id_Function, globalObject), parameters, bodyTree, bodyCode);
		Scriptable p = newObject();
		o.put(Constants.Id_prototype, p, Property.DONTDELETE);
		return o;
	}
	
	public UbiArray newArray(int size, Scriptable[] values) {
		UbiArray o = new UbiArray(globalObject.get(Constants.Id_Array, globalObject), size, values); 
		return o;
	}
	
	public UbiPlace newPlace(String location, String placeId) {
		UbiPlace o = new UbiPlace(globalObject.get(Constants.Id_Place, globalObject), location, placeId);
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
	
	public ObjectProxy newObjectProxy(String className, RemoteRef remoteRef) {
		ObjectProxy o = new ObjectProxy(className, remoteRef, proxyDelegate);
		return o;
	}
	
	public UbiNull getNull() {
		return UbiNull.getInstance();
	}
	
	public UbiUndefined getUndefined() {
		return UbiUndefined.getInstance();
	}
}
