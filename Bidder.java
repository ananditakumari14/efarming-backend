package com.wipro.velocity.efarming.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bidder {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String fullName;
	
    private String contactNumber;
    
	private String state;
	
	private String city;
	
	private String pin;
	
	private String accountnumber;
	
	private String ifsc;
	
	private String aadhar ;

	private String pan;

	private String tradelicense;
	
	private String password;
	
	private String email;
	
	private String address;

	public Bidder() {
		
	}

	public Bidder(String fullName, String contactNumber, String state, String city, String pin, String accountnumber,
			String ifsc, String aadhar, String pan, String tradelicense, String password, String email,
			String address) {
		this.fullName = fullName;
		this.contactNumber = contactNumber;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.accountnumber = accountnumber;
		this.ifsc = ifsc;
		this.aadhar = aadhar;
		this.pan = pan;
		this.tradelicense = tradelicense;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTradelicense() {
		return tradelicense;
	}

	public void setTradelicense(String tradelicense) {
		this.tradelicense = tradelicense;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}