package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity   //It represents a DB table in Java domain
public class Restaurant {

	//These are properties that MAP the columns in ORM  
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String locality;
	
	@Column
	private String  reviews;
	
	@Column
	private String speciality ;
	
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getReviews() {
		return reviews;
	}


	public void setReviews(String reviews) {
		this.reviews = reviews;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public Restaurant(int id, String name, String locality, String reviews, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.locality = locality;
		this.reviews = reviews;
		this.speciality = speciality;
	}


	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", locality=" + locality + ", reviews=" + reviews
				+ ", speciality=" + speciality + "]";
	}
	
	
}
