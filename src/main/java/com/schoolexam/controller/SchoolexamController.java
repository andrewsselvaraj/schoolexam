package com.schoolexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.SchoolExam;
import com.schoolexam.service.SchoolexamService;

@RestController
public class SchoolexamController {

	@Autowired
	private SchoolexamService schlservice;
	
	@PostMapping(value = "/addschool")
	public void addSchool(@RequestBody SchoolExam sch) {
		schlservice.addSchool(sch);
	}
}