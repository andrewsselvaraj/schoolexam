package com.schoolexam.vo;

public class ClassInfoVO {

	String pk_class_id;
	String class_name;
	String fk_school_id;
	String fk_section_id;
	String class_description;
	String created_by;
	String last_updated_by;
	String last_updated_date_time;
	String class_status;
	String class_notes;
	String class_active;
	public String getPk_class_id() {
		return pk_class_id;
	}
	public void setPk_class_id(String pk_class_id) {
		this.pk_class_id = pk_class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getFk_school_id() {
		return fk_school_id;
	}
	public void setFk_school_id(String fk_school_id) {
		this.fk_school_id = fk_school_id;
	}
	public String getFk_section_id() {
		return fk_section_id;
	}
	public void setFk_section_id(String fk_section_id) {
		this.fk_section_id = fk_section_id;
	}
	public String getClass_description() {
		return class_description;
	}
	public void setClass_description(String class_description) {
		this.class_description = class_description;
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
	public String getClass_status() {
		return class_status;
	}
	public void setClass_status(String class_status) {
		this.class_status = class_status;
	}
	public String getClass_notes() {
		return class_notes;
	}
	public void setClass_notes(String class_notes) {
		this.class_notes = class_notes;
	}
	public String getClass_active() {
		return class_active;
	}
	public void setClass_active(String class_active) {
		this.class_active = class_active;
	}
	public ClassInfoVO(String pk_class_id, String class_name, String fk_school_id, String fk_section_id,
			String class_description, String created_by, String last_updated_by, String last_updated_date_time,
			String class_status, String class_notes, String class_active) {
		super();
		this.pk_class_id = pk_class_id;
		this.class_name = class_name;
		this.fk_school_id = fk_school_id;
		this.fk_section_id = fk_section_id;
		this.class_description = class_description;
		this.created_by = created_by;
		this.last_updated_by = last_updated_by;
		this.last_updated_date_time = last_updated_date_time;
		this.class_status = class_status;
		this.class_notes = class_notes;
		this.class_active = class_active;
	}
	public ClassInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassInfoVO [pk_class_id=" + pk_class_id + ", class_name=" + class_name + ", fk_school_id="
				+ fk_school_id + ", fk_section_id=" + fk_section_id + ", class_description=" + class_description
				+ ", created_by=" + created_by + ", last_updated_by=" + last_updated_by + ", last_updated_date_time="
				+ last_updated_date_time + ", class_status=" + class_status + ", class_notes=" + class_notes
				+ ", class_active=" + class_active + "]";
	}
	
	
}
