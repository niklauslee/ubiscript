package org.ubiscript;

public class UbiUndefined extends UbiObject {

	private static UbiUndefined instance = new UbiUndefined();
	
	public static UbiUndefined getInstance() {
		return instance;
	}
	
	public UbiUndefined() {
		super(null);
	}
	
	public String getClassName() {
		return Constants.Id_Undefined;
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof UbiUndefined);
	}
	
	public boolean toBoolean() {
		return false;
	}
	
	public double toNumber() {
		// TODO NaN 처리하기. (아래 toInt()도 마찬가지)
		return 0.0d;
	}
	
	public int toInt() {
		return 0;
	}
	
	public String toString() {
		return Constants.Id_undefined; // display name is lower case.
	}
}
