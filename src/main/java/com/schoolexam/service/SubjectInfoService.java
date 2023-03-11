package com.schoolexam.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolexam.model.SubjectInfoModel;
import com.schoolexam.repository.SubjectInfoRepository;
import com.schoolexam.vo.SubjectInfoVO;

@Service
public class SubjectInfoService {

	@Autowired
	SubjectInfoRepository subjectinforepository;
	
	public void insertSubject(SubjectInfoVO si) {
		SubjectInfoModel subjectinfomodel = new SubjectInfoModel();
		Random ran3 = new Random();
		subjectinfomodel.setPk_subject_id(""+ran3.nextInt());
		subjectinfomodel.setFk_class_id(si.getFk_class_id());
		subjectinfomodel.setFk_school_id(si.getFk_school_id());
		subjectinfomodel.setPk_subject_id(si.getPk_subject_id());
		subjectinfomodel.setSubject_name(si.getSubject_name());
		subjectinfomodel.setSubject_detail(si.getSubject_detail());
		subjectinfomodel.setSubject_updated_by(si.getSubject_updated_by());
		subjectinfomodel.setSubject_updated_date_time(si.getSubject_updated_date_time());
		subjectinfomodel.setSubject_status(si.getSubject_status());
		
		subjectinforepository.saveAndFlush(subjectinfomodel);
	}
}
