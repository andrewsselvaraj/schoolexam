-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 15, 2023 at 02:31 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolexam`
--

-- --------------------------------------------------------

--
-- Table structure for table `answer_info`
--

DROP TABLE IF EXISTS `answer_info`;
CREATE TABLE IF NOT EXISTS `answer_info` (
  `pk_answer_id` varchar(50) NOT NULL,
  `ans_fk_question_id` varchar(50) NOT NULL,
  `ans_fk_school_id` varchar(50) NOT NULL,
  `ans_fk_class_id` varchar(50) NOT NULL,
  `ans_fk_subject_id` varchar(50) NOT NULL,
  `answer_data` varchar(50) NOT NULL,
  `correct_answer` varchar(50) NOT NULL,
  `ans_created_by` varchar(50) NOT NULL,
  `ans_last_updated_by` varchar(50) NOT NULL,
  `ans_last_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `ans_status` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_answer_id`),
  KEY `fk_ans_school_id` (`ans_fk_school_id`),
  KEY `fk_ans_class_id` (`ans_fk_class_id`),
  KEY `fk_ans_subject_id` (`ans_fk_subject_id`),
  KEY `fk_ans_ques_id` (`ans_fk_question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `class_info`
--

DROP TABLE IF EXISTS `class_info`;
CREATE TABLE IF NOT EXISTS `class_info` (
  `pk_class_id` varchar(50) NOT NULL,
  `class_name` varchar(50) NOT NULL,
  `fk_school_id` varchar(50) NOT NULL,
  `fk_section_id` varchar(50) NOT NULL,
  `class_description` varchar(50) NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `last_updated_by` varchar(50) NOT NULL,
  `last_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `class_status` varchar(50) NOT NULL,
  `class_notes` varchar(50) NOT NULL,
  `class_active` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_class_id`),
  KEY `fk_class_school_id` (`fk_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `class_info`
--

INSERT INTO `class_info` (`pk_class_id`, `class_name`, `fk_school_id`, `fk_section_id`, `class_description`, `created_by`, `last_updated_by`, `last_updated_date_time`, `class_status`, `class_notes`, `class_active`) VALUES
('c101', 'Music', '101', 'B', 'Music Class', 'Danny', 'Danny', '2023-03-03 02:51:08.079521', 'active', 'sample notes', 'Y');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `empId` varchar(10) NOT NULL,
  `empName` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empId`, `empName`) VALUES
('emp001', 'emp1'),
('emp002', 'emp2'),
('emp003', 'emp3');

-- --------------------------------------------------------

--
-- Table structure for table `question_info`
--

DROP TABLE IF EXISTS `question_info`;
CREATE TABLE IF NOT EXISTS `question_info` (
  `pk_question_id` varchar(50) NOT NULL,
  `question_name` varchar(50) NOT NULL,
  `ques_fk_school_id` varchar(50) NOT NULL,
  `ques_fk_class_id` varchar(50) NOT NULL,
  `ques_fk_subject_id` varchar(50) NOT NULL,
  `question_type` int NOT NULL,
  `question_url` varchar(50) NOT NULL,
  `media_type` varchar(50) NOT NULL,
  `ques_description` varchar(50) NOT NULL,
  `ques_created_by` varchar(50) NOT NULL,
  `ques_last_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `ques_status` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_question_id`),
  KEY `fk_ques_class_id` (`ques_fk_class_id`),
  KEY `fk_ques_school_id` (`ques_fk_school_id`),
  KEY `fk_ques_subject_id` (`ques_fk_subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `school_info`
--

DROP TABLE IF EXISTS `school_info`;
CREATE TABLE IF NOT EXISTS `school_info` (
  `pk_school_id` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `school_name` varchar(50) NOT NULL,
  `principal_name` varchar(50) NOT NULL,
  `school_address` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `country` varchar(50) NOT NULL,
  `pincode` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `website` varchar(50) NOT NULL,
  `contact_no` varchar(50) NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `last_updated_by` varchar(50) NOT NULL,
  `last_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `school_status` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `school_info`
--

INSERT INTO `school_info` (`pk_school_id`, `user_name`, `password`, `school_name`, `principal_name`, `school_address`, `city`, `state`, `country`, `pincode`, `email`, `website`, `contact_no`, `created_by`, `last_updated_by`, `last_updated_date_time`, `school_status`) VALUES
('-1037125628', 'ebgschool', 'ebgschool', 'EBGSchool', 'EBGPrincipal', 'Chennai', 'Chennai', 'TamilNadu', 'India', '600028', 'ebg@ebgschool.com', 'www.ebgschool.com', '1231231231', 'Christofer', 'Christ', '2023-03-08 18:30:00.000000', 'active'),
('101', 'kvs', 'password', 'KVS School', 'Arun', 'Coimbatore', 'Coimbatore', 'Tamilnadu', 'India', '123112', 'kvs@kvs.com', 'www.kvs.com', '1231231231', 'Danny', 'Danny', '2023-03-03 02:22:51.975123', 'active');

-- --------------------------------------------------------

--
-- Table structure for table `school_info_seq`
--

DROP TABLE IF EXISTS `school_info_seq`;
CREATE TABLE IF NOT EXISTS `school_info_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `school_info_seq`
--

INSERT INTO `school_info_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
CREATE TABLE IF NOT EXISTS `student_info` (
  `student_id` varchar(50) NOT NULL,
  `stu_fk_school_id` varchar(50) NOT NULL,
  `stu_fk_class_id` varchar(50) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `student_note` varchar(50) NOT NULL,
  `stu_last_updated_by` varchar(50) NOT NULL,
  `stu_last_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `stu_status` varchar(50) NOT NULL,
  PRIMARY KEY (`student_id`),
  KEY `fk_stu_class_id` (`stu_fk_class_id`),
  KEY `fk_stu_school_id` (`stu_fk_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `subject_info`
--

DROP TABLE IF EXISTS `subject_info`;
CREATE TABLE IF NOT EXISTS `subject_info` (
  `pk_subject_id` varchar(50) NOT NULL,
  `fk_class_id` varchar(50) NOT NULL,
  `fk_school_id` varchar(50) NOT NULL,
  `subject_name` varchar(50) NOT NULL,
  `subject_detail` varchar(400) NOT NULL,
  `subject_updated_by` varchar(50) NOT NULL,
  `subject_updated_date_time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
  `subject_status` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_subject_id`),
  KEY `fk_sub_class_id` (`fk_class_id`),
  KEY `fk_sub_school_id` (`fk_school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `answer_info`
--
ALTER TABLE `answer_info`
  ADD CONSTRAINT `fk_ans_class_id` FOREIGN KEY (`ans_fk_class_id`) REFERENCES `class_info` (`pk_class_id`),
  ADD CONSTRAINT `fk_ans_ques_id` FOREIGN KEY (`ans_fk_question_id`) REFERENCES `question_info` (`pk_question_id`),
  ADD CONSTRAINT `fk_ans_school_id` FOREIGN KEY (`ans_fk_school_id`) REFERENCES `school_info` (`pk_school_id`),
  ADD CONSTRAINT `fk_ans_subject_id` FOREIGN KEY (`ans_fk_subject_id`) REFERENCES `subject_info` (`pk_subject_id`);

--
-- Constraints for table `class_info`
--
ALTER TABLE `class_info`
  ADD CONSTRAINT `fk_class_school_id` FOREIGN KEY (`fk_school_id`) REFERENCES `school_info` (`pk_school_id`);

--
-- Constraints for table `question_info`
--
ALTER TABLE `question_info`
  ADD CONSTRAINT `fk_ques_class_id` FOREIGN KEY (`ques_fk_class_id`) REFERENCES `class_info` (`pk_class_id`),
  ADD CONSTRAINT `fk_ques_school_id` FOREIGN KEY (`ques_fk_school_id`) REFERENCES `school_info` (`pk_school_id`),
  ADD CONSTRAINT `fk_ques_subject_id` FOREIGN KEY (`ques_fk_subject_id`) REFERENCES `subject_info` (`pk_subject_id`);

--
-- Constraints for table `student_info`
--
ALTER TABLE `student_info`
  ADD CONSTRAINT `fk_stu_class_id` FOREIGN KEY (`stu_fk_class_id`) REFERENCES `class_info` (`pk_class_id`),
  ADD CONSTRAINT `fk_stu_school_id` FOREIGN KEY (`stu_fk_school_id`) REFERENCES `school_info` (`pk_school_id`);

--
-- Constraints for table `subject_info`
--
ALTER TABLE `subject_info`
  ADD CONSTRAINT `fk_sub_class_id` FOREIGN KEY (`fk_class_id`) REFERENCES `class_info` (`pk_class_id`),
  ADD CONSTRAINT `fk_sub_school_id` FOREIGN KEY (`fk_school_id`) REFERENCES `school_info` (`pk_school_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
