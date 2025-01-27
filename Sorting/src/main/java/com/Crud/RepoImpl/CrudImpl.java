package com.Crud.RepoImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.Crud.Entity.Student;
import com.Crud.Repo.Crud;

@Service("Student Service")
public class CrudImpl implements CrudRepo {
	
	@Autowired
	@Lazy
	private Crud crudRef;
	

	@Override
	public Iterable<Student> printByOrder(boolean asc, String... properties) {
		
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, properties);
		return crudRef.findAll(sort);
	}
	


}
