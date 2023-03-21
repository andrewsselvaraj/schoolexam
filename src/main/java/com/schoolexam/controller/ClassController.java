package com.schoolexam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.model.ClassInfoModel;
import com.schoolexam.repository.ClassInfoRepository;
import com.schoolexam.vo.ClassInfoVO;

@RestController
public class ClassController {
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
	
}
