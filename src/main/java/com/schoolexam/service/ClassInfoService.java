package com.schoolexam.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolexam.model.ClassInfoModel;
import com.schoolexam.repository.ClassInfoRepository;
import com.schoolexam.vo.ClassInfoVO;


@Service
public class ClassInfoService {
 
	@Autowired
	ClassInfoRepository classinforepository;
	
	public void insertClass(ClassInfoVO ci) {
		ClassInfoModel classinfomodel = new ClassInfoModel();
		Random ran2 = new Random();
		classinfomodel.setPk_class_id(""+ran2.nextInt());
		classinfomodel.setClass_name(ci.getClass_name());
		classinfomodel.setFk_school_id(ci.getFk_school_id());
		classinfomodel.setFk_section_id(ci.getFk_section_id());
		classinfomodel.setClass_description(ci.getClass_description());
		classinfomodel.setCreated_by(ci.getCreated_by());
		classinfomodel.setLast_updated_by(ci.getLast_updated_by());
		classinfomodel.setLast_updated_date_time(ci.getLast_updated_date_time());
		classinfomodel.setClass_status(ci.getClass_status());
		classinfomodel.setClass_notes(ci.getClass_notes());
		classinfomodel.setClass_active(ci.getClass_active());
		
		classinforepository.saveAndFlush(classinfomodel);
		
	
		
	}
}
