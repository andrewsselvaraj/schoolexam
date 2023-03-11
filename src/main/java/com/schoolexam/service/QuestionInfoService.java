package com.schoolexam.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolexam.model.QuestionInfoModel;
import com.schoolexam.repository.QuestionInfoRepository;
import com.schoolexam.vo.QuestionInfoVO;

@Service
public class QuestionInfoService {

	@Autowired
	QuestionInfoRepository questioninforepository;
	
	public void insertQuestion(QuestionInfoVO qi) {
		QuestionInfoModel questioninfomodel = new QuestionInfoModel();
		Random ran4 = new Random();
		questioninfomodel.setPk_question_id(""+ran4.nextInt());
		questioninfomodel.setQuestion_name(qi.getQuestion_name());
		questioninfomodel.setQues_fk_school_id(qi.getQues_fk_school_id());
		questioninfomodel.setQues_fk_class_id(qi.getQues_fk_class_id());
		questioninfomodel.setQues_fk_subject_id(qi.getQues_fk_subject_id());
		questioninfomodel.setQuestion_type(qi.getQuestion_type());
		questioninfomodel.setQuestion_url(qi.getQuestion_url());
		questioninfomodel.setMedia_type(qi.getMedia_type());
		questioninfomodel.setQues_description(qi.getQues_description());
		questioninfomodel.setQues_created_by(qi.getQues_created_by());
		questioninfomodel.setQues_last_updated_date_time(qi.getQues_last_updated_date_time());
		questioninfomodel.setQues_status(qi.getQues_status());
		
		questioninforepository.saveAndFlush(questioninfomodel);
	}
}
