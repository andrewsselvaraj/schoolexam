package com.schoolexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school_info")
public class SchoolExamFetchSchoolinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "pk_school_id")
	String pk_school_id;
	
	@Column(name = "user_name")
	String user_name;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "school_name")
	String school_name;
	
	@Column(name = "principal_name")
	String principal_name;
	
	@Column(name = "school_address")
	String school_address;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
	
	@Column(name = "pincode")
	String pincode;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "website")
	String website;
	
	@Column(name = "contact_no")
	String contact_no;
	
	@Column(name = "created_by")
	String created_by;
	
	@Column(name = "last_updated_by")
	String last_updated_by;
	
	@Column(name = "last_updated_date_time")
	String last_updated_date_time;
	
	@Column(name = "school_status")
	String school_status;

	public String getPk_school_id() {
		return pk_school_id;
	}

	public void setPk_school_id(String pk_school_id) {
		this.pk_school_id = pk_school_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getPrincipal_name() {
		return principal_name;
	}

	public void setPrincipal_name(String principal_name) {
		this.principal_name = principal_name;
	}

	public String getSchool_address() {
		return school_address;
	}

	public void setSchool_address(String school_address) {
		this.school_address = school_address;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public String getLast_updated_date_time() {
		return last_updated_date_time;
	}

	public void setLast_updated_date_time(String last_updated_date_time) {
		this.last_updated_date_time = last_updated_date_time;
	}

	public String getSchool_status() {
		return school_status;
	}

	public void setSchool_status(String school_status) {
		this.school_status = school_status;
	}
	
	
}
