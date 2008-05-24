package org.ubiscript;

public class UbiString extends ScriptableObject {
	
	private String value;
	
	public UbiString(Scriptable prototype, String value) {
		super(prototype);
		this.value = value;
	}
	
	public String getClassName() {
		return Constants.Id_String;
	}
	
	public String getValue() {
		return value;
	}
		
	public int toInt() {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public double toNumber() {
		try {
			return Double.parseDouble(value);
		} catch (NumberFormatException e) {
			return 0.0d;
		}
	}
	
	public boolean toBoolean() {
		if (value.equals(""))
			return false;
		return true;
	}

	public String toString() {
		return value;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof UbiString) {
			UbiString s = (UbiString) obj;
			return (value.equals(s.getValue()));
		}
		return false;
	}
	
	public static String normalizeString(String s) {
		s = s.substring(1, s.length()-1); // deleting enclosing double quote.
		s = s.replaceAll("\\\\n", "\n");
		s = s.replaceAll("\\\\r", "\r");
		s = s.replaceAll("\\\\t", "\t");
		s = s.replaceAll("\\\\b", "\b");
		s = s.replaceAll("\\\\f", "\f");
		s = s.replaceAll("\\\\\"", "\"");
		s = s.replaceAll("\\\\\\\\", "\\\\");
		return s;
	}
	
	public static String denormalizeString(String s) {
		s = s.replaceAll("\\\\", "\\\\\\\\");
		s = s.replaceAll("\"", "\\\"");
		s = s.replaceAll("\f", "\\\\f");
		s = s.replaceAll("\b", "\\\\b");
		s = s.replaceAll("\t", "\\\\t");
		s = s.replaceAll("\r", "\\\\r");
		s = s.replaceAll("\n", "\\\\n");
		s = "\"" + s + "\"";
		return s;
	}
}
