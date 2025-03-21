package com.MongoCrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.Student;
import com.MongoCrud.repo.StudentRepo;

@Service("student Service")
public class StudentManagementIMpl implements StudentManagementService{

	@Autowired
	private StudentRepo service;

	@Override
	public List<Student> fetchAllDetails(String name) {
		return service.fetchAllDetails(name);
	}

	@Override
	public List<Student> fetchDetailsUsingNameAndAge(String name, int age) {
		return service.fetchDetailsUsingNameAndAge(name, age);
	}

	@Override
	public List<Student> allStudentByAgeRande(int startAge, int endAge) {
		return service.allStudentByAgeRande(startAge, endAge);
	}

	@Override
	public List<Student> fetchUsingNameAndLocation(String name, String address) {
		
		return service.fetchUsingNameAndLocation(name, address);
	}

	@Override
	public List<Object[]> fetchNameUsingNameAndAge(String name, int age) {
		// TODO Auto-generated method stub
		return service.fetchNameUsingNameAndAge(name, age);
	}

	@Override
	public List<Object[]> fetchNameAndAgeUsingAddress(String address) {
		// TODO Auto-generated method stub
		return service.fetchNameAndAgeUsingAddress(address);
	}
	
}
