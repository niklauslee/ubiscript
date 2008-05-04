package org.ubiscript;

public class UbiRef extends UbiAbstractRef {
	private UbiObject base;
	public UbiRef(UbiObject base, String name) {
		super(UbiAbstractRef.REF_BY_NAME, name, -1);
		this.base = base;
	}
	public UbiRef(UbiObject base, int index) {
		super(UbiAbstractRef.REF_BY_INDEX, null, index);
		this.base = base;
	}
	public UbiObject getBase() {
		return base;
	}
	public String toString() {
		String s = "<REF:" + base + ":"
				+ (nameOrIndex == UbiAbstractRef.REF_BY_NAME ? name : index)
				+ ">";
		return s;
	}
}
