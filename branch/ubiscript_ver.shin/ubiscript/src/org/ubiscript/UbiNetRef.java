package org.ubiscript;

public class UbiNetRef extends UbiAbstractRef {
	private String location;
	private long baseId;
	public UbiNetRef(String location, long baseId, String name) {
		super(UbiAbstractRef.REF_BY_NAME, name, -1);
		this.location = location;
		this.baseId = baseId;
	}
	public UbiNetRef(String location, long baseId, int index) {
		super(UbiAbstractRef.REF_BY_NAME, null, index);
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
		String s = "<NETREF:" + location + ":" + baseId + ":"
				+ (nameOrIndex == UbiAbstractRef.REF_BY_NAME ? name : index)
				+ ">";
		return s;
	}
}
