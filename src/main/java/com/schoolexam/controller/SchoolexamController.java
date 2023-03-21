package com.schoolexam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	List<SchoolExamFetchSchoolinfo> getSchoolinfo() {
		return schoolinfoFetchRepository.findAll();
	}
	
	@GetMapping(path = "/findallschoolinfo/{id}")
	Optional<SchoolExamFetchSchoolinfo> getSchoolinfobyID(@PathVariable String id) {
		//return schoolinfoFetchRepository.findAll();
		return schoolinfoFetchRepository.findById(id);
	}
	//school info --end--

	
	//Class Info --start--
	
			@Autowired
			com.schoolexam.service.ClassInfoService ClassInfoService;
			
			@Autowired
			ClassInfoRepository classinforepository;
			
			@PostMapping(value = "/addclass")
			public void insertClass(@RequestBody ClassInfoVO ci) {
				ClassInfoService.insertClass(ci);
			}
			
			@GetMapping(path = "/getclassinfo")
			List<ClassInfoModel> fetchClassinfo() {
				return classinforepository.findAll();
			}
			
			@GetMapping(path = "/getclassinfobyid/{id}")
			Optional<ClassInfoModel> getclassinfoById(@PathVariable String id) {
				return classinforepository.findById(id);
			}
			
			//Class Info --end--
	
			
			//Subject info --start--
			
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
			
			
			//Subject info --end--
			
			
			//Question info --start--
			@Autowired
			QuestionInfoRepository questioninforepository;
			@Autowired
			com.schoolexam.service.QuestionInfoService QuestionInfoService;
			@PostMapping(value = "/addquestion")
			public void insertQuestion(@RequestBody QuestionInfoVO qi) {
				QuestionInfoService.insertQuestion(qi);
			}
			
			@GetMapping(path = "/getqinfo")
			List<QuestionInfoModel> getquesinfo() {
				return questioninforepository.findAll();
			}
			
			@GetMapping(path = "/getquestioninfo")
			List<QuestionInfoModel> fetchQuestionInfo() {
				return questioninforepository.findAll();
			}
			
			@GetMapping(path = "/getquestioninfobyid/{id}")
			Optional<QuestionInfoModel> getquestioninfoById(@PathVariable String id) {
				return questioninforepository.findById(id);
			}
			
			
			//Question info --end--
			
			
			//Answer info --start--
			
			@Autowired
			AnswerInfoRepository answerinforepository;
			@Autowired
			com.schoolexam.service.AnswerInfoService AnswerInfoService;
			@PostMapping(value = "/addanswer")
			public void insertAnswer(@RequestBody AnswerInfoVO ai) {
				AnswerInfoService.insertAnswer(ai);
			}
			
			@GetMapping(path = "/getanswerinfo") 
			List<AnswerInfoModel> fetchAnswerInfo() {
				return answerinforepository.findAll();
			}
			
			@GetMapping(path = "/getanswerinfobyid/{id}")
			Optional<AnswerInfoModel> getanswerinfoById(@PathVariable String id) {
				return answerinforepository.findById(id);
			}
			//Answer info --end--
			

	
}