package com.schoolexam.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.SchoolExamFetchSchoolinfo;

public interface SchoolinfoFetchService extends JpaRepository<SchoolExamFetchSchoolinfo, String> {

	@Override
	List<SchoolExamFetchSchoolinfo> findAll();
	
}
