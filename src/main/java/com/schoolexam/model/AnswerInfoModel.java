package com.schoolexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="answer_info")

public class AnswerInfoModel {

	
	@Id
	@Column(name = "pk_answer_id")
	String pk_answer_id;
	
	@Column(name = "ans_fk_question_id")
	String ans_fk_question_id;
	
	@Column(name = "ans_fk_school_id")
	String ans_fk_school_id;
	
	@Column(name = "ans_fk_class_id")
	String ans_fk_class_id;
	
	@Column(name = "ans_fk_subject_id")
	String ans_fk_subject_id;
	
	@Column(name = "answer_data")
	String answer_data;
	
	@Column(name = "correct_answer")
	String correct_answer;
	
	@Column(name = "ans_created_by")
	String ans_created_by;
	
	@Column(name = "ans_last_updated_by")
	String ans_last_updated_by;
	
	@Column(name = "ans_last_updated_date_time")
	String ans_last_updated_date_time;
	
	@Column(name = "ans_status")
	String ans_status;

	public String getPk_answer_id() {
		return pk_answer_id;
	}

	public void setPk_answer_id(String pk_answer_id) {
		this.pk_answer_id = pk_answer_id;
	}

	public String getAns_fk_question_id() {
		return ans_fk_question_id;
	}

	public void setAns_fk_question_id(String ans_fk_question_id) {
		this.ans_fk_question_id = ans_fk_question_id;
	}

	public String getAns_fk_school_id() {
		return ans_fk_school_id;
	}

	public void setAns_fk_school_id(String ans_fk_school_id) {
		this.ans_fk_school_id = ans_fk_school_id;
	}

	public String getAns_fk_class_id() {
		return ans_fk_class_id;
	}

	public void setAns_fk_class_id(String ans_fk_class_id) {
		this.ans_fk_class_id = ans_fk_class_id;
	}

	public String getAns_fk_subject_id() {
		return ans_fk_subject_id;
	}

	public void setAns_fk_subject_id(String ans_fk_subject_id) {
		this.ans_fk_subject_id = ans_fk_subject_id;
	}

	public String getAnswer_data() {
		return answer_data;
	}

	public void setAnswer_data(String answer_data) {
		this.answer_data = answer_data;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public String getAns_created_by() {
		return ans_created_by;
	}

	public void setAns_created_by(String ans_created_by) {
		this.ans_created_by = ans_created_by;
	}

	public String getAns_last_updated_by() {
		return ans_last_updated_by;
	}

	public void setAns_last_updated_by(String ans_last_updated_by) {
		this.ans_last_updated_by = ans_last_updated_by;
	}

	public String getAns_last_updated_date_time() {
		return ans_last_updated_date_time;
	}

	public void setAns_last_updated_date_time(String ans_last_updated_date_time) {
		this.ans_last_updated_date_time = ans_last_updated_date_time;
	}

	public String getAns_status() {
		return ans_status;
	}

	public void setAns_status(String ans_status) {
		this.ans_status = ans_status;
	}
	
	
}
