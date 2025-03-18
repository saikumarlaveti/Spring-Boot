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
	public String registStudent(Student s) {
		// TODO Auto-generated method stub
		return  service.insert(s).getId() + " is Saved";
	}

	@Override
	public String MultipleRegisterStudets(List<Student> StudentList) {
		return service.saveAll(StudentList).size() + " Student was Saved";
	}

	@Override
	public List<Student> fetchAllRecord() {
		
		return service.findAll();
	}

	@Override
	public List<Student> fetchBySorting(boolean asc, String... properties) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		return service.findAll(sort);
	}

	@Override
	public Optional<Student> fetchById(String id) {
		Optional<Student> opt = service.findById(id);
		return opt;
	}

	@Override
	public String updateById(String id) {
		Optional<Student> opt1 = service.findById(id);
		if(opt1.isPresent()) {
			Student s = opt1.get();
			s.setAddress("Hyderabad");
			return service.save(s) + " Changed Successfully";
			
		}
		
		return 	"Student is not found";
		
	}

	@Override
	public String removeDocument(String id) {
		Optional<Student> opt2 = service.findById(id);
		if(opt2.isPresent()) {
			service.deleteById(id);
			return "Student infomation is remove from the database";
		}
		return "Student is alredy deleted";
	}
	
	

	
	
	
	
	
}
