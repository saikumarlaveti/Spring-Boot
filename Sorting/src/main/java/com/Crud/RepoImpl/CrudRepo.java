package com.Crud.RepoImpl;

import java.util.List;
import java.util.Optional;

import com.Crud.Entity.Student;

public interface CrudRepo {
	
	public Iterable<Student> printByOrder(boolean asc , String... properties);

}
