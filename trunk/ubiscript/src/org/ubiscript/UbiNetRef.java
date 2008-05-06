package org.ubiscript;

public class UbiNetRef extends UbiObject {
	
	private String location;
	private long baseId;
	
	public UbiNetRef(String location, long baseId, String name) {
		super(null);
		this.location = location;
		this.baseId = baseId;
	}
	
	public UbiNetRef(String location, long baseId, int index) {
		super(null);
		this.location = location;
		this.baseId = baseId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public long getBaseId() {
		return baseId;
	}
	
	public String toString() {
		String s = "<NETREF:" + location + ":" + baseId + ">";
		return s;
	}
}
