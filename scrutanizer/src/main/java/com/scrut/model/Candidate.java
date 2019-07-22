package com.scrut.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Base64;
import java.nio.charset.*;


import java.util.Date;

@Entity
@Table(name = "candidate")
public class Candidate {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO,generator="candidate_seq")
	 @SequenceGenerator(name="candidate_seq",sequenceName="candidate_seq",allocationSize = 1)
	@Column(name = "candidate_id", updatable = false, nullable = false)
	private int id;
	
	@Column(name = "candidate_name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
//	@Column(name="registration_date")
//	private Date regDate;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name = "mobile")
	private String mobileNumber;
	
	@Column(name="city")
	private String city;
	
	@Column(name = "country")
	private String country;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encoderString = encoder.encodeToString(normalString.getBytes(StandardCharsets.UTF_8));
		this.password = encoderString;
	}
//	public Date getRegDate() {
//		return regDate;
//	}
//
//	public void setRegDate(Date regDate) {
//
//		this.regDate = regDate;
//	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
