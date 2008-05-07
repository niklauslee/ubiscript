package org.ubiscript;

public class UbiNetRef extends UbiObject {
	
	private String location;
	private String placeId;
	private String refId;
	
	public UbiNetRef(String location, String placeId, String refId) {
		super(null);
		this.location = location;
		this.placeId = placeId;
		this.refId = refId;
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
	
	public String getRefId() {
		return refId;
	}
	
	public String toString() {
		String s = "<NETREF:" + location + "#" + placeId + ":" + refId +  ">";
		return s;
	}
}
