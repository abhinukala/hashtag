package com.hashtag.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "coordinates")
public class Coordinates {
	
	@Id
	@Column(length = 0, nullable = false, name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 0, nullable = true, name = "lat")
	private double latitude;
	
	@Column(length = 0, nullable = true, name = "lon")
	private double longitude;
	
	@Column(length = 50, nullable = true, name = "status")
	private String status;
	
	public Coordinates() {
		
	}
	
	public Coordinates(double latitude, double longitude, String status) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
