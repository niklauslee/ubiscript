package org.ubiscript;

public interface EvaluatorDelegate {
	public void delegateExecute(NativePlace place, String[] names, UbiObject[] values, String code);
	public UbiObject delegateGet(UbiNetRef ref);
	public void delegatePut(UbiNetRef ref, UbiObject value);
	public UbiObject delegateCall(UbiNetRef ref, UbiObject[] args);
}
