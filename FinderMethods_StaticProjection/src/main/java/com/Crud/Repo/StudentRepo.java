package com.Crud.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Crud.Entity.Student;
import com.Crud.view.ResultView;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	public Iterable<ResultView> findByIdGreaterThanEqualAndIdLessThanEqual(Integer start,Integer end);
}
