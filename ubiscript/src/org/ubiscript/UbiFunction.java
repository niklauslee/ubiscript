package org.ubiscript;

import org.antlr.runtime.tree.Tree;

// TODO Closure 개념 구현하기.

public class UbiFunction extends ScriptableObject {

	protected String[] parameters;
	protected Tree bodyTree;
	protected String bodyCode;

	public UbiFunction(Scriptable prototype, String[] parameters, 
			Tree bodyTree, String bodyCode) {
		super(prototype);
		this.parameters = parameters;
		this.bodyTree = bodyTree;
		this.bodyCode = bodyCode;
	}
	
	public String getClassName() {
		return Constants.Id_Function;
	}
		
	public String toString() {
		String s = "";
		if (parameters != null) {
			for (int i = 0; i < parameters.length; i++) {
				if (i > 0) s = s + ",";
				s = s + parameters[i].toString();
			}
		}
		return "function(" + s + ")";
	}

	public Scriptable call(Env env, Evaluator eval, Scriptable[] args, Scriptable thisObj) throws UbiException {
		UbiObject activation = env.newObject();
		env.pushScope(activation);
		for (int i = 0; i < parameters.length; i++) {
			activation.put(parameters[i], args[i], Property.DONTDELETE);
		}
		activation.put(Constants.Id_this, thisObj, Property.DONTDELETE);
		try {
			if (bodyTree != null) {
				eval.evaluateStatement(env, bodyTree); 
			} else {
				if (bodyCode != null)
					eval.evaluateStatement(env, bodyCode);
			}
		} catch(UbiReturn e) {
			env.popScope();
			return e.getResult();
		}
		env.popScope();
		return env.getUndefined();
	}
	
	public Scriptable construct(Env env, Evaluator eval, Scriptable[] args) throws UbiException {
		Scriptable thisObj = env.newObject(); 
		call(env, eval, args, thisObj);
		return thisObj;
	}
}
