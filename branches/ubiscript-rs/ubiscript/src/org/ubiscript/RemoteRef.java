package org.ubiscript;

public class RemoteRef {

	private String location;
	private String placeId;
	private long exportId;
	
	public RemoteRef(String location, String placeId, long exportId) {
		this.location = location;
		this.placeId = placeId;
		this.exportId = exportId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getPlaceId() {
		return placeId;
	}
	
	public long getExportId() {
		return exportId;
	}
	
}
