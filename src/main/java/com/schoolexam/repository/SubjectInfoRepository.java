package com.schoolexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolexam.model.SubjectInfoModel;

public interface SubjectInfoRepository extends JpaRepository<SubjectInfoModel, String> {

}
