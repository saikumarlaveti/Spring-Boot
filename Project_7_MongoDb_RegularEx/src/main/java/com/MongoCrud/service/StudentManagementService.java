package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import com.MongoCrud.document.Student;

public interface StudentManagementService {
	
	public List<Student> getNameUsingRegx(String name);

	public int getStudentCountByAgeRange(int min,int max);
	
	public List<Student> getascendingOrder();
	
	public List<Student> getDescendingOrder();
	
	public int deleteByAddress(String address);
	
	public boolean isExists(String name);


}
