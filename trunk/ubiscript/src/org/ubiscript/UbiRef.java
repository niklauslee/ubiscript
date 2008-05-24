package org.ubiscript;

public class UbiRef extends ScriptableObject {

	public static final int REF_BY_NAME = 0;
	public static final int REF_BY_INDEX = 1;
	
	private Scriptable base;
	protected int nameOrIndex;
	protected String name;
	protected int index;

	public UbiRef(Scriptable base, String name) {
		super(null);
		this.base = base;
		this.nameOrIndex = REF_BY_NAME;
		this.name = name;
		this.index = -1;
	}
	
	public UbiRef(Scriptable base, int index) {
		super(null);
		this.base = base;
		this.nameOrIndex = REF_BY_INDEX;
		this.name = null;
		this.index = index;
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
	
	public Scriptable getBase() {
		return base;
	}
	
	public String toString() {
		String s = "<REF:" + base + ":"
				+ (nameOrIndex == REF_BY_NAME ? name : index)
				+ ">";
		return s;
	}
}
