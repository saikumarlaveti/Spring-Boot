package com.Crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.delete.Student;
import com.Crud.repo.deleteOperations;

@Service("StudentDetails")
public class ServicesImpl implements Services{
	
	@Autowired
	public deleteOperations ref;

	@Override
	public void saveStudent(List<Student> s) {
		ref.saveAll(s);
		System.out.println("Student record saved...");
		
	}
	

	@Override
	public void deleteUsingID(int id) {
		ref.deleteById(id);
		System.out.println("Successfully Deleted");
	}


	@Override
	public void removeAllStudent() {
		ref.deleteAll();
		System.out.println("Successfully Delete all Records");
	}


	@Override
	public void isAvailable(int id) {
		boolean res = ref.existsById(id);
		System.out.println("is Student Available : " + res);
		
	}


	@Override
	public void removeAllbyUsingId(List<Integer> s) {
		ref.deleteAllById(s);
		
	}

}
