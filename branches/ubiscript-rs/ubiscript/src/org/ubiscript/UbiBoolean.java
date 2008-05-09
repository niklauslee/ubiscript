package org.ubiscript;

public class UbiBoolean extends ScriptableObject {
	private boolean value = false;
	public UbiBoolean(Scriptable prototype, boolean value) {
		super(prototype);
		this.value = value;
	}
	public String getClassName() {
		return Constants.Id_Boolean;
	}
	public boolean getValue() {
		return value;
	}
	public boolean toBoolean() {
		return value;
	}
	public double toNumber() {
		return (value ? 1.0d : 0.0d);
	}
	public int toInt() {
		return (value ? 1 : 0);
	}
	public String toString() {
		return Boolean.toString(value);
	}
	public boolean equals(Object obj) {
		if (obj instanceof UbiBoolean) {
			UbiBoolean b = (UbiBoolean) obj;
			return (b.getValue() == value);
		}
		return false;
	}
}
