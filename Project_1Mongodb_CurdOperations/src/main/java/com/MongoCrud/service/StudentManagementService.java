package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import com.MongoCrud.document.Student;

public interface StudentManagementService {
	
	public String registStudent(Student s);
	
	public String MultipleRegisterStudets(List<Student> StudentList);
	
	public List<Student> fetchAllRecord();
	
	public List<Student> fetchBySorting(boolean asc,String...properties);
	
	public Optional<Student> fetchById(String id);
	
	public String updateById(String id);
	
	public String removeDocument(String id);
	
}
