package com.schoolexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.vo.AnswerInfoVO;
import com.schoolexam.vo.ClassInfoVO;
import com.schoolexam.vo.QuestionInfoVO;
import com.schoolexam.vo.SchoolExamVO;
import com.schoolexam.vo.SubjectInfoVO;
import com.schoolexam.model.SchoolExamFetchSchoolinfo;
import com.schoolexam.repository.AnswerInfoRepository;
import com.schoolexam.repository.ClassInfoRepository;
import com.schoolexam.repository.QuestionInfoRepository;
import com.schoolexam.repository.SchoolinfoFetchRepository;
import com.schoolexam.repository.SubjectInfoRepository;

@RestController
public class SchoolexamController {

	//Add School --start--
	@Autowired
	SchoolinfoFetchRepository schoolinfoFetchRepository;
	@Autowired
	com.schoolexam.service.SchoolService SchoolService;
	@PostMapping(value = "/addschool")
	public void addSchool(@RequestBody SchoolExamVO sch) {
		SchoolService.addSchool(sch);
	}
	//Add school --end--

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
	
	//Add Question --start--
	@Autowired
	QuestionInfoRepository questioninforepository;
	@Autowired
	com.schoolexam.service.QuestionInfoService QuestionInfoService;
	@PostMapping(value = "/addquestion")
	public void insertQuestion(@RequestBody QuestionInfoVO qi) {
		QuestionInfoService.insertQuestion(qi);
	}
	//Add Question --end--
	
	//Add Answer --start--
	@Autowired
	AnswerInfoRepository answerinforepository;
	@Autowired
	com.schoolexam.service.AnswerInfoService AnswerInfoService;
	@PostMapping(value = "/addanswer")
	public void insertAnswer(@RequestBody AnswerInfoVO ai) {
		AnswerInfoService.insertAnswer(ai);
	}
	//Add Answer --end--
	
	//Fetch school info --start--
	@GetMapping(path = "findall_school_info")
	List<SchoolExamFetchSchoolinfo> getSchoolinfo() {
		return schoolinfoFetchRepository.findAll();
	}
	//Fetch school info --end--
	
}