package com.schoolexam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.AnswerInfoModel;
import com.schoolexam.repository.AnswerInfoRepository;
import com.schoolexam.vo.AnswerInfoVO;

@RestController
public class AnswerController {

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
}
