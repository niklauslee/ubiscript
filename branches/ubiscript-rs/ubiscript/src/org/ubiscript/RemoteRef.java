package org.ubiscript;

public class RemoteRef {

	private String location;
	private String interpreterId;
	private String exportId;
	
	public RemoteRef(String location, String interpreterId, String exportId) {
		this.location = location;
		this.interpreterId = interpreterId;
		this.exportId = exportId;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getInterpreterId() {
		return interpreterId;
	}
	
	public String getExportId() {
		return exportId;
	}
	
}
