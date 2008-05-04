package org.ubiscript;

public class UbiAbstractRef extends UbiObject {

	public static final int REF_BY_NAME = 0;
	public static final int REF_BY_INDEX = 1;
	protected int nameOrIndex;
	protected String name;
	protected int index;
	
	public UbiAbstractRef(int nameOrIndex, String name, int index) {
		super(null);
		this.nameOrIndex = nameOrIndex;
		this.name = name;
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

}
