package com.schoolexam.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schoolexam.vo.UserVO;


@RestController
@CrossOrigin()
@RequestMapping(path = "/login")
public class LoginController {

	//Add School --start--

	@PostMapping(value = "/login")
	public UserVO addSchool(@RequestBody UserVO userVO) {
		if(userVO.getUser_name().equalsIgnoreCase("jessore"))
		return userVO;
		else
		return null;
	}
	//Add school --end--

	//Add Class --start--

	//Add Class --end--
	

	//Add Subject --end--
	
	//Add Question --start--

	//Add Question --end--
	
	//Add Answer --start--

	//Fetch school info --end--
	
}