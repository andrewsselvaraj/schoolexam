package com.schoolexam.vo;

public class QuestionInfoVO {

	String pk_question_id;
	String question_name;
	String ques_fk_school_id;
	String ques_fk_class_id;
	String ques_fk_subject_id;
	String question_type;
	String question_url;
	String media_type;
	String ques_description;
	String ques_created_by;
	String ques_last_updated_date_time;
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
	public QuestionInfoVO(String pk_question_id, String question_name, String ques_fk_school_id,
			String ques_fk_class_id, String ques_fk_subject_id, String question_type, String question_url,
			String media_type, String ques_description, String ques_created_by, String ques_last_updated_date_time,
			String ques_status) {
		super();
		this.pk_question_id = pk_question_id;
		this.question_name = question_name;
		this.ques_fk_school_id = ques_fk_school_id;
		this.ques_fk_class_id = ques_fk_class_id;
		this.ques_fk_subject_id = ques_fk_subject_id;
		this.question_type = question_type;
		this.question_url = question_url;
		this.media_type = media_type;
		this.ques_description = ques_description;
		this.ques_created_by = ques_created_by;
		this.ques_last_updated_date_time = ques_last_updated_date_time;
		this.ques_status = ques_status;
	}
	public QuestionInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "QuestionInfoVO [pk_question_id=" + pk_question_id + ", question_name=" + question_name
				+ ", ques_fk_school_id=" + ques_fk_school_id + ", ques_fk_class_id=" + ques_fk_class_id
				+ ", ques_fk_subject_id=" + ques_fk_subject_id + ", question_type=" + question_type + ", question_url="
				+ question_url + ", media_type=" + media_type + ", ques_description=" + ques_description
				+ ", ques_created_by=" + ques_created_by + ", ques_last_updated_date_time="
				+ ques_last_updated_date_time + ", ques_status=" + ques_status + "]";
	}
	
	
}
