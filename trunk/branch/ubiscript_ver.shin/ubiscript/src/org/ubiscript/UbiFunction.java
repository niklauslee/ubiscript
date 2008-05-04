package org.ubiscript;

import org.antlr.runtime.tree.Tree;

// TODO Closure 개념 구현하기.

public class UbiFunction extends UbiObject {

	private String[] parameters;
	private Tree bodyTree;
	private String bodyCode;

	public UbiFunction(UbiObject prototype, String[] parameters, 
			Tree bodyTree, String bodyCode) {
		super(prototype);
		this.parameters = parameters;
		this.bodyTree = bodyTree;
		this.bodyCode = bodyCode;
	}
	public String getClassName() {
		return Constants.Id_Function;
	}
	public String[] getParameters() {
		return parameters;
	}
	public void setParameters(String[] params) {
		this.parameters = params;
	}
	public Tree getBodyTree() {
		return bodyTree;
	}
	public void setBodyTree(Tree body) {
		this.bodyTree = body;
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
	public UbiObject call(Environment env, Evaluator eval, UbiObject[] args, UbiObject thisObj) throws UbiException {
		UbiActivation activation = env.newActivation();
		env.pushScope(activation);
		for (int i = 0; i < parameters.length; i++) {
			activation.put(parameters[i], args[i], Property.DONTDELETE);
		}
		activation.put("this", thisObj, Property.DONTDELETE);
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
	public UbiObject construct(Environment env, Evaluator eval, UbiObject[] args) throws UbiException {
		UbiObject thisObj = env.newObject(); 
		call(env, eval, args, thisObj);
		return thisObj;
	}
}
