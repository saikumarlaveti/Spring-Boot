package com.Crud.services;

import java.util.List;

import com.Crud.delete.Student;

public interface Services {
	
	public void saveStudent(List<Student> s);
	
	public void isAvailable(int id);
	
	public void removeAllbyUsingId(List<Integer> s);
	
	public void deleteUsingID(int id);
	
	public void removeAllStudent();

}
