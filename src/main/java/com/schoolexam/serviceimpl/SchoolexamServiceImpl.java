package com.schoolexam.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.schoolexam.dbutil.DBUtil;
import com.schoolexam.model.SchoolExam;
import com.schoolexam.service.SchoolexamService;

@Service
public class SchoolexamServiceImpl implements SchoolexamService {

	Connection connection;
	
	public SchoolexamServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
	}
	
	@Override
	public void addSchool(SchoolExam sch) {
		String pk_school_id = sch.getPk_school_id();
		String user_name = sch.getUser_name();
		String password = sch.getPassword();
		String school_name = sch.getSchool_name();
		String principal_name = sch.getPrincipal_name();
		String school_address = sch.getSchool_address();
		String city = sch.getCity();
		String state = sch.getState();
		String country = sch.getCountry();
		String pincode = sch.getPincode();
		String email = sch.getEmail();
		String website = sch.getWebsite();
		String contact_no = sch.getContact_no();
		String created_by = sch.getCreated_by();
		String last_updated_by = sch.getLast_updated_by();
		String last_updated_date_time = sch.getLast_updated_date_time();
		String school_status = sch.getSchool_status();
		
		String insertQuery = "INSERT INTO school_info VALUES('"+pk_school_id+"','"+user_name+"','"+password+"','"+school_name+"','"+principal_name+"','"+school_address+"','"+city+"','"+state+"','"+country+"','"+pincode+"','"+email+"','"+website+"','"+contact_no+"','"+created_by+"','"+last_updated_by+"','"+last_updated_date_time+"','"+school_status+"')";
		try {
			PreparedStatement stmt = connection.prepareStatement(insertQuery);
			stmt.execute();
			System.out.println("Data inserted into DB");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
