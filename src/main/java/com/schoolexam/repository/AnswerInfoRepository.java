package com.schoolexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.AnswerInfoModel;

public interface AnswerInfoRepository extends JpaRepository<AnswerInfoModel, String> {

}
