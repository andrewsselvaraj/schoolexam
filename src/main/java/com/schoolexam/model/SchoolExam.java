package com.schoolexam.model;

public class SchoolExam {
	String pk_school_id;
	String user_name;
	String password;
	String school_name;
	String principal_name;
	String school_address;
	String city;
	String state;
	String country;
	String pincode;
	String email;
	String website;
	String contact_no;
	String created_by;
	String last_updated_by;
	String last_updated_date_time;
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
	public SchoolExam(String pk_school_id, String user_name, String password, String school_name, String principal_name,
			String school_address, String city, String state, String country, String pincode, String email,
			String website, String contact_no, String created_by, String last_updated_by, String last_updated_date_time, String school_status) {
		super();
		this.pk_school_id = pk_school_id;
		this.user_name = user_name;
		this.password = password;
		this.school_name = school_name;
		this.principal_name = principal_name;
		this.school_address = school_address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.email = email;
		this.website = website;
		this.contact_no = contact_no;
		this.created_by = created_by;
		this.last_updated_by = last_updated_by;
		this.last_updated_date_time = last_updated_date_time;
		this.school_status = school_status;
	}
	public SchoolExam() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SchoolExam [pk_school_id=" + pk_school_id + ", user_name=" + user_name + ", password=" + password
				+ ", school_name=" + school_name + ", principal_name=" + principal_name + ", school_address="
				+ school_address + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
				+ pincode + ", email=" + email + ", website=" + website + ", contact_no=" + contact_no + ", created_by="
				+ created_by + ", last_updated_by=" + last_updated_by + ", last_updated_date_time="
				+ last_updated_date_time + ", school_status=" + school_status + "]";
	}
	
	
	
}

