package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import com.MongoCrud.document.Student;

public interface StudentManagementService {
	
	public List<Student> fetchByName(String name);
	
	public List<Student> findByAgeOrderByAgeAsc(int age);

	
}
