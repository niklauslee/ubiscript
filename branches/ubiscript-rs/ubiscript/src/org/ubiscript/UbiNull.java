package org.ubiscript;

public class UbiNull extends ScriptableObject {
	
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
	
	public int toInt() {
		return 0;
	}
	
	public boolean toBoolean() {
		return false;
	}
	
	public double toNumber() {
		return 0.0d;
	}	
	
	public String toString() {
		return Constants.Id_null;
	}
}
