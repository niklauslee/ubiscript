package org.ubiscript;

@SuppressWarnings("serial")
public class UbiReturn extends UbiException {
	
	private Scriptable result = null;
	
	public UbiReturn(Scriptable result) {
		this.result = result;
	}
	
	public Scriptable getResult() {
		return result;
	}
}
