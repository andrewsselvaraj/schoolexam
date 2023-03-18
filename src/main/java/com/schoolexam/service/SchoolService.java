package com.schoolexam.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.schoolexam.vo.SchoolExamVO;
import com.schoolexam.model.SchoolExamFetchSchoolinfo;
import com.schoolexam.repository.SchoolinfoFetchRepository;


@Service
public class SchoolService {

	@Autowired
	SchoolinfoFetchRepository schoolinfoFetchRepository;
	
	public void addSchool(SchoolExamVO sch) {
		SchoolExamFetchSchoolinfo schoolExamFetchSchoolinfo = new SchoolExamFetchSchoolinfo();
		Random ran = new Random();
		schoolExamFetchSchoolinfo.setPk_school_id(""+ran.nextInt());
		schoolExamFetchSchoolinfo.setCity(sch.getCity());
		schoolExamFetchSchoolinfo.setContact_no(sch.getContact_no());

		schoolExamFetchSchoolinfo.setUser_name(sch.getUser_name());  
		schoolExamFetchSchoolinfo.setPassword(sch.getPassword());   
		schoolExamFetchSchoolinfo.setSchool_name(sch.getSchool_name());   
		schoolExamFetchSchoolinfo.setPrincipal_name(sch.getPrincipal_name());   
		schoolExamFetchSchoolinfo.setSchool_address(sch.getSchool_address());   
		schoolExamFetchSchoolinfo.setCity(sch.getCity());   
		schoolExamFetchSchoolinfo.setState(sch.getState());   
		schoolExamFetchSchoolinfo.setCountry(sch.getCountry());   
		schoolExamFetchSchoolinfo.setPincode(sch.getPincode());   
		schoolExamFetchSchoolinfo.setEmail(sch.getEmail());  
		schoolExamFetchSchoolinfo.setWebsite(sch.getWebsite());  
		schoolExamFetchSchoolinfo.setContact_no(sch.getContact_no());  
		schoolExamFetchSchoolinfo.setCreated_by(sch.getCreated_by());  
		schoolExamFetchSchoolinfo.setLast_updated_by(sch.getLast_updated_by());   
		schoolExamFetchSchoolinfo.setLast_updated_date_time(sch.getLast_updated_date_time());   
		schoolExamFetchSchoolinfo.setSchool_status(sch.getSchool_status());  
		schoolinfoFetchRepository.saveAndFlush(schoolExamFetchSchoolinfo);
	}
}
