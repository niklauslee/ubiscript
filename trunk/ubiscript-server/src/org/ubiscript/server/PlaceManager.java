package org.ubiscript.server;

import java.util.Hashtable;

public class PlaceManager {
	
	private String url;
	private Hashtable<String, Place> places;

	public PlaceManager(String url) {
		this.url = url;
		places = new Hashtable<String, Place>();
	}
	
	public Place getPlace(String id) {
		Place place = places.get(id);
		if (place == null) {
			place = new Place(id, url);
			places.put(id, place);
		}
		return place;
	}
}
