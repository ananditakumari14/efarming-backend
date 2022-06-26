package com.wipro.velocity.efarming.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class insurance {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String season;
	
	private String year;
	
	private String crop;
	
	private String sumOfInsured;
	
	private String area;

	public insurance() {
		// TODO Auto-generated constructor stub
	}

	public insurance(String season, String year, String crop, String sumOfInsured, String area) {
		this.season = season;
		this.year = year;
		this.crop = crop;
		this.sumOfInsured = sumOfInsured;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public String getSumOfInsured() {
		return sumOfInsured;
	}

	public void setSumOfInsured(String sumOfInsured) {
		this.sumOfInsured = sumOfInsured;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
