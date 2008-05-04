package org.ubiscript;

/**
 * Property of UbiObject.
 * @author niklaus
 *
 */
public class Property {
	public static final int EMPTY = 0x00;
	public static final int READONLY = 0x01;
	public static final int DONTENUM = 0x02;
	public static final int DONTDELETE = 0x04;
	public static final int CONST = READONLY & DONTENUM & DONTDELETE;
	private String name = null;
	UbiObject value = null;
	private int attribute;
	public Property(String name, UbiObject value, int attribute) {
		this.name = name;
		this.value = value;
		this.attribute = attribute;
	}
	public String getName() {
		return name;
	}
	public UbiObject getValue() {
		return value;
	}
	public void setValue(UbiObject value) {
		this.value = value;
	}
	public int getAttribute() {
		return attribute;
	}
	public boolean hasAttribute(int attribute) {
		return ((this.attribute & attribute) != 0);
	}
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}
	public String toString() {
		return name + " = " + value;
	}
}
