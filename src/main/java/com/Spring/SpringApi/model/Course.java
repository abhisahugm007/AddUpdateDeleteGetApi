package com.Spring.SpringApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private long id;
	private String tital;
	private String description;
	public Course(long id, String tital, String description) {
		super();
		this.id = id;
		this.tital = tital;
		this.description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", tital=" + tital + ", description=" + description + "]";
	}
	
	
}
