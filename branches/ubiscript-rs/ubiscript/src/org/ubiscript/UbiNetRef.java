package org.ubiscript;

public class UbiNetRef extends UbiAbstractRef {
	
	private String location;
	private String placeId;
	private String baseId;
	
	public UbiNetRef(String location, String placeId, String baseId, String name) {
		super(UbiAbstractRef.REF_BY_NAME, name, -1);
		this.location = location;
		this.placeId = placeId;
		this.baseId = baseId;
	}

	public UbiNetRef(String location, String placeId, String baseId, int index) {
		super(UbiAbstractRef.REF_BY_INDEX, null, index);
		this.location = location;
		this.placeId = placeId;
		this.baseId = baseId;
	}

	public String getClassName() {
		return Constants.Id_NetRef;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public String getBaseId() {
		return baseId;
	}
	
	public String toString() {
		String s = "<NETREF:" + location + "#" + placeId + ":" + baseId + ":";
		if (nameOrIndex == UbiAbstractRef.REF_BY_NAME)
			s = s + name + ">";
		else
			s = s + index + ">";
		return s;
	}
}
