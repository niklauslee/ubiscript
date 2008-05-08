package org.ubiscript;

public class UbiNull extends UbiObject {
	
	private static UbiNull instance = new UbiNull();

	public static UbiNull getInstance() {
		return instance;
	}
	
	public UbiNull() {
		super(null);
	}
	
	public String getClassName() {
		return Constants.Id_Null;
	}
	
	public boolean equals(Object obj) {
		return (obj instanceof UbiNull);
	}
	
	public boolean toBoolean() {
		return false;
	}
	
	public double toNumber() {
		return 0.0d;
	}
	
	public int toInt() {
		return 0;
	}
	
	public String toString() {
		return "null";
	}
}
