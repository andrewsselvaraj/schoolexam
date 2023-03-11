package com.schoolexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.QuestionInfoModel;


public interface QuestionInfoRepository extends JpaRepository<QuestionInfoModel, String> {

}
