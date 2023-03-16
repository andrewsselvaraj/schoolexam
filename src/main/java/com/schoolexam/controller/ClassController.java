package com.schoolexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.schoolexam.repository.ClassInfoRepository;
import com.schoolexam.vo.ClassInfoVO;

public class ClassController {
	//Add Class --start--
		@Autowired
		ClassInfoRepository classinforepository;
		@Autowired
		com.schoolexam.service.ClassInfoService ClassInfoService;
		@PostMapping(value = "/addclass")
		public void insertClass(@RequestBody ClassInfoVO ci) {
			ClassInfoService.insertClass(ci);
		}
		//Add Class --end--
}
