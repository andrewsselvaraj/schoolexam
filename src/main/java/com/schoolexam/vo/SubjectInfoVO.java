package com.schoolexam.vo;

public class SubjectInfoVO {

	String pk_subject_id;
	String fk_class_id;
	String fk_school_id;
	String subject_name;
	String subject_detail;
	String subject_updated_by;
	String subject_updated_date_time;
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
	public SubjectInfoVO(String pk_subject_id, String fk_class_id, String fk_school_id, String subject_name,
			String subject_detail, String subject_updated_by, String subject_updated_date_time, String subject_status) {
		super();
		this.pk_subject_id = pk_subject_id;
		this.fk_class_id = fk_class_id;
		this.fk_school_id = fk_school_id;
		this.subject_name = subject_name;
		this.subject_detail = subject_detail;
		this.subject_updated_by = subject_updated_by;
		this.subject_updated_date_time = subject_updated_date_time;
		this.subject_status = subject_status;
	}
	
	
	
	public SubjectInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SubjectInfoVO [pk_subject_id=" + pk_subject_id + ", fk_class_id=" + fk_class_id + ", fk_school_id="
				+ fk_school_id + ", subject_name=" + subject_name + ", subject_detail=" + subject_detail
				+ ", subject_updated_by=" + subject_updated_by + ", subject_updated_date_time="
				+ subject_updated_date_time + ", subject_status=" + subject_status + "]";
	}
	
	
}
