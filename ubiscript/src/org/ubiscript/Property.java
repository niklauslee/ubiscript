package org.ubiscript;

/**
 * Property of UbiObject.
 * @author niklaus
 *
 */
public class Property {
	
	public static final int
			EMPTY = 0x00,
			READONLY = 0x01,
			DONTENUM = 0x02,
			DONTDELETE = 0x04,
			TRANSIENT = 0x08;

	public static final int
			CONST = READONLY & DONTENUM & DONTDELETE,
			PREDEFINED = CONST & TRANSIENT;
	
	private String name = null;
	Scriptable value = null;
	private int attribute;
	
	public Property(String name, Scriptable value, int attribute) {
		this.name = name;
		this.value = value;
		this.attribute = attribute;
	}
	
	public String getName() {
		return name;
	}
	
	public Scriptable getValue() {
		return value;
	}
	
	public void setValue(Scriptable value) {
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
	
	public static boolean hasAttribute(int base, int attribute) {
		return ((base & attribute) != 0);
	}
	
}
