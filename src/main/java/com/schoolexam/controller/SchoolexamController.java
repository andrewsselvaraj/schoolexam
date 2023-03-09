package com.schoolexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.SchoolExam;
import com.schoolexam.model.SchoolExamFetchSchoolinfo;
import com.schoolexam.service.SchoolexamService;
import com.schoolexam.service.SchoolinfoFetchService;

@RestController
public class SchoolexamController {

	@Autowired
	private SchoolexamService schlservice;
	
	@PostMapping(value = "/addschool")
	public void addSchool(@RequestBody SchoolExam sch) {
		schlservice.addSchool(sch);
	}
	
	@Autowired
	SchoolinfoFetchService schoolinfofetchservice;
	
	@GetMapping(path = "findall_school_info")
	List<SchoolExamFetchSchoolinfo> getSchoolinfo() {
		return schoolinfofetchservice.findAll();
	}
	
}