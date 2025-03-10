package com.Crud.RepoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Crud.Entity.Student;
import com.Crud.Repo.Crud;

@Service("Student Service")
public class CrudImpl implements CrudRepo {
	
	private Crud CrudRef;
	
	public long fetchCount() {
		return CrudRef.count();
	}

	@Override
	public Iterable<Student> searchAll() {
		Iterable<Student> list = CrudRef.findAll();
		return list;
	}

	@Override
	public Iterable<Student> searchAllById(List<Integer> ids) {
		Iterable<Student> list = CrudRef.findAllById(ids);
		return list;
	}

	@Override
	public Optional<Student> searchById(int id) {
		Optional<Student> list = CrudRef.findById(id);
		return list;
	}

	@Override
	public boolean avaiable(int id) {
		boolean res = CrudRef.existsById(id);
		return res;
	}

}
