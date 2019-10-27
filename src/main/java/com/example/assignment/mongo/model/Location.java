package com.example.assignment.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document(collection = "locations")
public class Location {

	private String locationName;

	public Location() {
	}

	public String getlocationName() {
		return locationName;
	}

	public void setlocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return locationName;
	}
}