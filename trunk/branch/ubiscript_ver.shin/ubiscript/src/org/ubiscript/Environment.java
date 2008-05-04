package org.ubiscript;

import org.antlr.runtime.tree.*;

// TODO NativeJavaObject 구현하기
// TODO NativeJavaClass 구현하기
// TODO NativeActiveXObject 구현하기
// TODO NativeXMLObject 구현하기
// TODO NativeWebObject 구현하기

public class Environment {
	
	private UbiObject currentScope;
	private UbiObject rootScope;

	public Environment() throws UbiException {
		initialize();
	}
	public UbiObject getCurrentScope() {
		return currentScope;
	}
	public UbiObject getRootScope() {
		return rootScope;
	}
	public void setRootScope(UbiObject obj) {
		rootScope = obj;
	}
	public void pushScope(UbiObject scope) {
		scope.setParentScope(currentScope);
		currentScope = scope;
	}
	public void popScope() {
		if (currentScope.getParentScope() != null) {
			currentScope = currentScope.getParentScope();
		}
	}
	private void initialize() throws UbiException {
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
	
	public UbiObject newObject() {
		UbiObject o = new UbiObject(rootScope.get(Constants.Id_Object));
		return o;
	}
	public UbiNumber newNumber(double value) {
		UbiNumber o = new UbiNumber(rootScope.get(Constants.Id_Number), value);
		return o;
	}
	public UbiBoolean newBoolean(boolean value) {
		UbiBoolean o = new UbiBoolean(rootScope.get(Constants.Id_Boolean), value);
		return o;
	}
	public UbiString newString(String value) {
		UbiString o = new UbiString(rootScope.get(Constants.Id_String), value);
		return o;
	}
	public UbiFunction newFunction(String[] parameters, Tree bodyTree, String bodyCode) throws UbiException {
		UbiFunction o = new UbiFunction(rootScope.get(Constants.Id_Function), parameters, bodyTree, bodyCode);
		UbiObject p = newObject();
		o.put(Constants.Id_prototype, p, Property.DONTDELETE);
		return o;
	}
	public NativeArray newArray(int size, UbiObject[] values) {
		NativeArray o = new NativeArray(rootScope.get(Constants.Id_Array), this, size, values); 
		return o;
	}
	public UbiReturn newReturn(UbiObject result) {
		return new UbiReturn(result);
	}
	public UbiBreak newBreak() {
		return new UbiBreak();
	}
	public UbiContinue newContinue() {
		return new UbiContinue();
	}
	public UbiRef newRef(UbiObject base, String name) {
		UbiRef o = new UbiRef(base, name);
		return o;
	}
	public UbiRef newRef(UbiObject base, int index) {
		UbiRef o = new UbiRef(base, index); 
		return o;
	}
	public UbiNetRef newNetRef(String location, long baseId, String name) {
		UbiNetRef o = new UbiNetRef(location, baseId, name);
		return o; 
	}
	public UbiNetRef newNetRef(String location, long baseId, int index) {
		UbiNetRef o = new UbiNetRef(location, baseId, index);
		return o; 
	}
	public UbiActivation newActivation() {
		UbiActivation o = new UbiActivation();
		return o;
	}
	public UbiNull getNull() {
		return UbiNull.getInstance();
	}
	public UbiUndefined getUndefined() {
		return UbiUndefined.getInstance();
	}
}
