package com.schoolexam.vo;

public class AnswerInfoVO {

	String pk_answer_id;
	String ans_fk_question_id;
	String ans_fk_school_id;
	String ans_fk_class_id;
	String ans_fk_subject_id;
	String answer_data;
	String correct_answer;
	String ans_created_by;
	String ans_last_updated_by;
	String ans_last_updated_date_time;
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
	public AnswerInfoVO(String pk_answer_id, String ans_fk_question_id, String ans_fk_school_id, String ans_fk_class_id,
			String ans_fk_subject_id, String answer_data, String correct_answer, String ans_created_by,
			String ans_last_updated_by, String ans_last_updated_date_time, String ans_status) {
		super();
		this.pk_answer_id = pk_answer_id;
		this.ans_fk_question_id = ans_fk_question_id;
		this.ans_fk_school_id = ans_fk_school_id;
		this.ans_fk_class_id = ans_fk_class_id;
		this.ans_fk_subject_id = ans_fk_subject_id;
		this.answer_data = answer_data;
		this.correct_answer = correct_answer;
		this.ans_created_by = ans_created_by;
		this.ans_last_updated_by = ans_last_updated_by;
		this.ans_last_updated_date_time = ans_last_updated_date_time;
		this.ans_status = ans_status;
	}
	public AnswerInfoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnswerInfoVO [pk_answer_id=" + pk_answer_id + ", ans_fk_question_id=" + ans_fk_question_id
				+ ", ans_fk_school_id=" + ans_fk_school_id + ", ans_fk_class_id=" + ans_fk_class_id
				+ ", ans_fk_subject_id=" + ans_fk_subject_id + ", answer_data=" + answer_data + ", correct_answer="
				+ correct_answer + ", ans_created_by=" + ans_created_by + ", ans_last_updated_by=" + ans_last_updated_by
				+ ", ans_last_updated_date_time=" + ans_last_updated_date_time + ", ans_status=" + ans_status + "]";
	}
	
	
}
