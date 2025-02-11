package com.Crud.RepoImpl;

import java.util.List;
import java.util.Optional;

import com.Crud.Entity.Student;

public interface CrudRepo {
	
	public long fetchCount();
	
	public Iterable<Student> searchAll();

	public Iterable<Student> searchAllById(List<Integer> ids);
	
	public Optional<Student> searchById(int id);
	
	public boolean avaiable(int id);

}
