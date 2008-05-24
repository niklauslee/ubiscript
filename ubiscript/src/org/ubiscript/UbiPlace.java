package org.ubiscript;

public class UbiPlace extends ScriptableObject {

	private String location;
	private String placeId;
	
	public UbiPlace(Scriptable prototype, String location, String placeId) {
		super(prototype);
		this.location = location;
		if ((placeId == null) || (placeId.trim().equals("")))
			this.placeId = java.util.UUID.randomUUID().toString();
		else
			this.placeId = placeId;
	}

	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public String toString() {
		return "<PLACE:" + location + "#" + placeId + ">";
	}
	
}
