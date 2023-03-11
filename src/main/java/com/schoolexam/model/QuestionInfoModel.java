package com.schoolexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="question_info")

public class QuestionInfoModel {

	@Id
	@Column(name = "pk_question_id")
	String pk_question_id;
	
	@Column(name = "question_name")
	String question_name;
	
	@Column(name = "ques_fk_school_id")
	String ques_fk_school_id;
	
	@Column(name = "ques_fk_class_id")
	String ques_fk_class_id;
	
	@Column(name = "ques_fk_subject_id")
	String ques_fk_subject_id;
	
	@Column(name = "question_type")
	String question_type;
	
	@Column(name = "question_url")
	String question_url;
	
	@Column(name = "media_type")
	String media_type;
	
	@Column(name = "ques_description")
	String ques_description;
	
	@Column(name = "ques_created_by")
	String ques_created_by;
	
	@Column(name = "ques_last_updated_date_time")
	String ques_last_updated_date_time;
	
	@Column(name = "ques_status")
	String ques_status;

	public String getPk_question_id() {
		return pk_question_id;
	}

	public void setPk_question_id(String pk_question_id) {
		this.pk_question_id = pk_question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

	public String getQues_fk_school_id() {
		return ques_fk_school_id;
	}

	public void setQues_fk_school_id(String ques_fk_school_id) {
		this.ques_fk_school_id = ques_fk_school_id;
	}

	public String getQues_fk_class_id() {
		return ques_fk_class_id;
	}

	public void setQues_fk_class_id(String ques_fk_class_id) {
		this.ques_fk_class_id = ques_fk_class_id;
	}

	public String getQues_fk_subject_id() {
		return ques_fk_subject_id;
	}

	public void setQues_fk_subject_id(String ques_fk_subject_id) {
		this.ques_fk_subject_id = ques_fk_subject_id;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public String getQuestion_url() {
		return question_url;
	}

	public void setQuestion_url(String question_url) {
		this.question_url = question_url;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getQues_description() {
		return ques_description;
	}

	public void setQues_description(String ques_description) {
		this.ques_description = ques_description;
	}

	public String getQues_created_by() {
		return ques_created_by;
	}

	public void setQues_created_by(String ques_created_by) {
		this.ques_created_by = ques_created_by;
	}

	public String getQues_last_updated_date_time() {
		return ques_last_updated_date_time;
	}

	public void setQues_last_updated_date_time(String ques_last_updated_date_time) {
		this.ques_last_updated_date_time = ques_last_updated_date_time;
	}

	public String getQues_status() {
		return ques_status;
	}

	public void setQues_status(String ques_status) {
		this.ques_status = ques_status;
	}
	
	
}
