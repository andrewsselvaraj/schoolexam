package com.schoolexam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.QuestionInfoModel;
import com.schoolexam.repository.QuestionInfoRepository;
import com.schoolexam.vo.QuestionInfoVO;

@RestController
@CrossOrigin()
public class QuestionController {

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
	
	
		
}
