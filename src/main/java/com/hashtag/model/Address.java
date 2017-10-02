package com.hashtag.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@Column(length = 0, nullable = false, name = "address_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 50, nullable = false, name = "address_line1")
	private String addressLine1;
	
	@Column(length = 50, nullable = true, name = "address_line2")
	private String addressLine2;
	
	@Column(length = 50, nullable = false, name = "city")
	private String city;
	
	@Column(length = 50, nullable = false, name = "state")
	private String state;
	
	@Column(length = 50, nullable = false, name = "country")
	private String country;
	
	@Column(length = 50, nullable = false, name = "hashtag")
	private String hashtag;
	
	@Column(length = 0, nullable = true, name = "lat")
	private double lat;
	
	@Column(length = 0, nullable = true, name = "lon")
	private double lon;
	
	public Address() {
		
	}

	public Address(String addressLine1, String addressLine2, String city, String state, 
			String country, String hashtag) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.hashtag = hashtag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	
	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public String getUriBuilder() throws Exception {
	
		String build = "'"+this.addressLine1+"','"+this.addressLine2+"',"
				+ "'"+this.city+"', '"+this.state+"'";
		
		System.out.println(build);
		return build;
	}
}
