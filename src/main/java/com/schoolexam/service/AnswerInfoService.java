package com.schoolexam.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolexam.model.AnswerInfoModel;
import com.schoolexam.repository.AnswerInfoRepository;
import com.schoolexam.vo.AnswerInfoVO;

@Service
public class AnswerInfoService {

	@Autowired
	AnswerInfoRepository answerinforepository;
	
	public void insertAnswer(AnswerInfoVO ai) {
		AnswerInfoModel answerinfomodel = new AnswerInfoModel();
		Random ran5 = new Random();
		answerinfomodel.setPk_answer_id(""+ran5.nextInt());
		answerinfomodel.setAns_fk_question_id(ai.getAns_fk_question_id());
		answerinfomodel.setAns_fk_school_id(ai.getAns_fk_school_id());
		answerinfomodel.setAns_fk_class_id(ai.getAns_fk_class_id());
		answerinfomodel.setAns_fk_subject_id(ai.getAns_fk_subject_id());
		answerinfomodel.setAnswer_data(ai.getAnswer_data());
		answerinfomodel.setCorrect_answer(ai.getCorrect_answer());
		answerinfomodel.setAns_created_by(ai.getAns_created_by());
		answerinfomodel.setAns_last_updated_by(ai.getAns_last_updated_by());
		answerinfomodel.setAns_last_updated_date_time(ai.getAns_last_updated_date_time());
		answerinfomodel.setAns_status(ai.getAns_status());
		
		answerinforepository.saveAndFlush(answerinfomodel);
	}
}
