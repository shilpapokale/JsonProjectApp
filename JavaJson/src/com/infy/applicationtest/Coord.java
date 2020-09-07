package com.infy.applicationtest;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("coord")
public class Coord {

	private double lon;
	private double lat;
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
}
