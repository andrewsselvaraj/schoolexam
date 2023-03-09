package com.schoolexam.repository;

import org.springframework.stereotype.Repository;

import com.schoolexam.vo.SchoolExamVO;

@Repository
public interface SchoolexamRepository {
	public void addSchool(SchoolExamVO sch);
}
