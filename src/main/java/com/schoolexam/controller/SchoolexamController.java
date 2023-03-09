package com.schoolexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.vo.SchoolExamVO;
import com.schoolexam.model.SchoolExamFetchSchoolinfo;
import com.schoolexam.repository.SchoolexamRepository;
import com.schoolexam.repository.SchoolinfoFetchRepository;

@RestController
public class SchoolexamController {

	@Autowired
	SchoolinfoFetchRepository schoolinfoFetchRepository;
	@Autowired
	com.schoolexam.service.SchoolService SchoolService;
	@PostMapping(value = "/addschool")
	public void addSchool(@RequestBody SchoolExamVO sch) {
		SchoolService.addSchool(sch);
		
	}

	
	@GetMapping(path = "findall_school_info")
	List<SchoolExamFetchSchoolinfo> getSchoolinfo() {
		return schoolinfoFetchRepository.findAll();
	}
	
}