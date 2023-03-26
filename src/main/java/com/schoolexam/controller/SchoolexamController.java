package com.schoolexam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.vo.AnswerInfoVO;
import com.schoolexam.vo.ClassInfoVO;
import com.schoolexam.vo.QuestionInfoVO;
import com.schoolexam.vo.SchoolExamVO;
import com.schoolexam.vo.SubjectInfoVO;

import io.github.resilience4j.retry.annotation.Retry;

import com.schoolexam.model.AnswerInfoModel;
import com.schoolexam.model.ClassInfoModel;
import com.schoolexam.model.QuestionInfoModel;
import com.schoolexam.model.SchoolExamFetchSchoolinfo;
import com.schoolexam.model.SubjectInfoModel;
import com.schoolexam.repository.AnswerInfoRepository;
import com.schoolexam.repository.ClassInfoRepository;
import com.schoolexam.repository.QuestionInfoRepository;
import com.schoolexam.repository.SchoolinfoFetchRepository;
import com.schoolexam.repository.SubjectInfoRepository;

@RestController
@CrossOrigin()
public class SchoolexamController {

	//School info --start--
	@Autowired
	SchoolinfoFetchRepository schoolinfoFetchRepository;
	@Autowired
	com.schoolexam.service.SchoolService SchoolService;
	@PostMapping(value = "/addschool")
	public void addSchool(@RequestBody SchoolExamVO sch) {
		SchoolService.addSchool(sch);
	}
	
	@GetMapping(path = "/fetchschoolinfo")
	@Retry(name = "schoolinforetry", fallbackMethod = "schoolinfofallback")
	List<SchoolExamFetchSchoolinfo> getSchoolinfo() {
		return schoolinfoFetchRepository.findAll();
	}
	
	List<SchoolExamFetchSchoolinfo> schoolinfofallback(Exception e) {
		return new ArrayList<SchoolExamFetchSchoolinfo>();
	}
	
	@GetMapping(path = "/findallschoolinfo/{id}")
	Optional<SchoolExamFetchSchoolinfo> getSchoolinfobyID(@PathVariable String id) {
		//return schoolinfoFetchRepository.findAll();
		return schoolinfoFetchRepository.findById(id);
	}
	//school info --end--

	
	
}