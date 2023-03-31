package com.schoolexam.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.schoolexam.model.ClassInfoModel;
import com.schoolexam.vo.ClassInfoVO;


public interface ClassInfoRepository extends JpaRepository<ClassInfoModel, String>{

	@Query("SELECT c FROM class_info c WHERE c.class_name =:n")
	public List<ClassInfoModel> getClassInfoModelByName(@Param("n") String class_name);
	

}
