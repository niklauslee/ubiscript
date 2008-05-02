package org.ubiscript;

public class UbiNumber extends UbiObject {
	private double value;
	public UbiNumber(UbiObject prototype, double value) {
		super(prototype);
		this.value = value;
	}
	public String getClassName() {
		return Constants.Id_Number;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public boolean isInt() {
		return  (Math.round(value) == value);
	}
	public boolean toBoolean() {
		if (isInt() && (toInt() == 0))
			return false;
		return true;
	}
	public double toNumber() {
		return value;
	}
	public int toInt() {
		return (int) Math.round(value);
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
