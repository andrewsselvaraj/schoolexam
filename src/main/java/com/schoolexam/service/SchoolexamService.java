package com.schoolexam.service;

import org.springframework.stereotype.Repository;

import com.schoolexam.model.SchoolExam;

@Repository
public interface SchoolexamService {
	public void addSchool(SchoolExam sch);
}
