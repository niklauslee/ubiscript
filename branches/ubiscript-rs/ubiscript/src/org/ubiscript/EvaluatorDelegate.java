package org.ubiscript;

public interface EvaluatorDelegate {
	public void execute(NativePlace place, String[] names, Scriptable[] bases, String code);
}
