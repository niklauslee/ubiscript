package org.ubiscript.server;

import java.util.Hashtable;

public class PlaceManager {
	
	private String location;
	private Hashtable<String, Place> places;

	public PlaceManager(String location) {
		this.location = location;
		places = new Hashtable<String, Place>();
	}
	
	public Place getPlace(String id) {
		Place place = places.get(id);
		if (place == null) {
			place = new Place(location, id);
			places.put(id, place);
		}
		return place;
	}
}
