package org.ubiscript;

public class UbiRef extends UbiObject {

	public static final int REF_BY_NAME = 0;
	public static final int REF_BY_INDEX = 1;
	private UbiObject base;
	protected int nameOrIndex;
	protected String name;
	protected int index;
	
	public UbiRef(UbiObject base, String name) {
		super(null);
		this.base = base;
		this.nameOrIndex = REF_BY_NAME;
		this.name = name;
		this.index = -1;
	}
	
	public UbiRef(UbiObject base, int index) {
		super(null);
		this.base = base;
		this.nameOrIndex = REF_BY_INDEX;
		this.name = null;
		this.index = index;
	}
	
	public UbiObject getBase() {
		return base;
	}
	
	public int getNameOrIndex() {
		return nameOrIndex;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String toString() {
		String s = "<REF:" + base + ":"
				+ (nameOrIndex == REF_BY_NAME ? name : index)
				+ ">";
		return s;
	}
}
