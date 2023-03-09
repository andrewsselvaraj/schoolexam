package com.schoolexam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.SchoolExamFetchSchoolinfo;

public interface SchoolinfoFetchRepository extends JpaRepository<SchoolExamFetchSchoolinfo, String> {


	
}
