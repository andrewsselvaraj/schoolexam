package com.schoolexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subject_info")

public class SubjectInfoModel {

	@Id
	@Column(name = "pk_subject_id")
	String pk_subject_id;
	
	@Column(name = "fk_class_id")
	String fk_class_id;
	
	@Column(name = "fk_school_id")
	String fk_school_id;
	
	@Column(name = "subject_name")
	String subject_name;
	
	@Column(name = "subject_detail")
	String subject_detail;
	
	@Column(name = "subject_updated_by")
	String subject_updated_by;
	
	@Column(name = "subject_updated_date_time")
	String subject_updated_date_time;
	
	@Column(name = "subject_status")
	String subject_status;

	public String getPk_subject_id() {
		return pk_subject_id;
	}

	public void setPk_subject_id(String pk_subject_id) {
		this.pk_subject_id = pk_subject_id;
	}

	public String getFk_class_id() {
		return fk_class_id;
	}

	public void setFk_class_id(String fk_class_id) {
		this.fk_class_id = fk_class_id;
	}

	public String getFk_school_id() {
		return fk_school_id;
	}

	public void setFk_school_id(String fk_school_id) {
		this.fk_school_id = fk_school_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getSubject_detail() {
		return subject_detail;
	}

	public void setSubject_detail(String subject_detail) {
		this.subject_detail = subject_detail;
	}

	public String getSubject_updated_by() {
		return subject_updated_by;
	}

	public void setSubject_updated_by(String subject_updated_by) {
		this.subject_updated_by = subject_updated_by;
	}

	public String getSubject_updated_date_time() {
		return subject_updated_date_time;
	}

	public void setSubject_updated_date_time(String subject_updated_date_time) {
		this.subject_updated_date_time = subject_updated_date_time;
	}

	public String getSubject_status() {
		return subject_status;
	}

	public void setSubject_status(String subject_status) {
		this.subject_status = subject_status;
	}
	
	
}
