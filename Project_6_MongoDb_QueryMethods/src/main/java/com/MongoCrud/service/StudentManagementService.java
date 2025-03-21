package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import com.MongoCrud.document.Student;

public interface StudentManagementService {
	
	public List<Student> fetchAllDetails(String name);
	
	public List<Student> fetchDetailsUsingNameAndAge(String name , int age);

	public List<Student> allStudentByAgeRande(int startAge ,int endAge);
	
	public List<Student> fetchUsingNameAndLocation(String name,String address);
	
	public List<Object[]> fetchNameUsingNameAndAge(String name , int age);
	
	public List<Object[]> fetchNameAndAgeUsingAddress(String address);

	
}
