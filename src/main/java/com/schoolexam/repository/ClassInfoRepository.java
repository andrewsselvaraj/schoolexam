package com.schoolexam.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.ClassInfoModel;
import com.schoolexam.vo.ClassInfoVO;


public interface ClassInfoRepository extends JpaRepository<ClassInfoModel, String>{

	//findAll--
	

}
