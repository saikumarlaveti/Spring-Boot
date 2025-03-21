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
	public List<Student> getNameUsingRegx(String name) {
		return service.getNameUsingRegx(name);
	}

	@Override
	public int getStudentCountByAgeRange(int min, int max) {
		// TODO Auto-generated method stub
		return service.getStudentCountByAgeRange(min, max);
	}

	@Override
	public List<Student> getascendingOrder() {
		// TODO Auto-generated method stub
		return service.getascendingOrder();
	}

	@Override
	public List<Student> getDescendingOrder() {
		// TODO Auto-generated method stub
		return service.getDescendingOrder();
	}

	@Override
	public int deleteByAddress(String address) {
		// TODO Auto-generated method stub
		return service.deleteByAddress(address);
	}

	@Override
	public boolean isExists(String name) {
		// TODO Auto-generated method stub
		return service.isExists(name);
	}

	

	

	

	
}
