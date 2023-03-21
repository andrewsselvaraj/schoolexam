package com.schoolexam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.SubjectInfoModel;
import com.schoolexam.repository.SubjectInfoRepository;
import com.schoolexam.vo.SubjectInfoVO;

@RestController
public class SubjectController {

	@Autowired
	SubjectInfoRepository subjectinforepository;
	@Autowired
	com.schoolexam.service.SubjectInfoService SubjectInfoService;
	@PostMapping(value = "/addsubject")
	public void insertSubject(@RequestBody SubjectInfoVO si) {
		SubjectInfoService.insertSubject(si);
	}
	
	@GetMapping(path = "/getsubjectinfo")
	List<SubjectInfoModel> fetchSubjectinfo() {
		return subjectinforepository.findAll();
	}
	
	@GetMapping(path = "/getsubjectinfobyid/{id}")
	Optional<SubjectInfoModel> getsubjectinfoById(@PathVariable String id) {
		return subjectinforepository.findById(id);
	}
}
