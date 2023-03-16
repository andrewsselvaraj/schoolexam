package com.schoolexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.schoolexam.repository.SubjectInfoRepository;
import com.schoolexam.vo.SubjectInfoVO;

public class SubjectController {

	//Add Subject --start--
		@Autowired
		SubjectInfoRepository subjectinforepository;
		@Autowired
		com.schoolexam.service.SubjectInfoService SubjectInfoService;
		@PostMapping(value = "/addsubject")
		public void insertSubject(@RequestBody SubjectInfoVO si) {
			SubjectInfoService.insertSubject(si);
		}
		//Add Subject --end--
}
