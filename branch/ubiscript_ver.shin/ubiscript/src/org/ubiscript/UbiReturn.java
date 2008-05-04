package org.ubiscript;

@SuppressWarnings("serial")
public class UbiReturn extends UbiException {
	private UbiObject result = null;
	public UbiReturn(UbiObject result) {
		this.result = result;
	}
	public UbiObject getResult() {
		return result;
	}
}
