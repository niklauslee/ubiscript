package org.ubiscript;

public class UbiNumber extends ScriptableObject {
	
	private double value;
	
	public UbiNumber(Scriptable prototype, double value) {
		super(prototype);
		this.value = value;
	}
	
	public String getClassName() {
		return Constants.Id_Number;
	}
	
	public double getValue() {
		return value;
	}
	
	public boolean isInt() {
		return  (Math.round(value) == value);
	}
	
	public int toInt() {
		return (int) Math.round(value);
	}

	public double toNumber() {
		return value;
	}

	public boolean toBoolean() {
		if (isInt() && (toInt() == 0))
			return false;
		return true;
	}

	public String toString() {
		return (isInt() ? Integer.toString(toInt()) : Double.toString(value));
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof UbiNumber) {
			UbiNumber n = (UbiNumber) obj;
			return (n.getValue() == value);
		}
		return false;
	}
}
