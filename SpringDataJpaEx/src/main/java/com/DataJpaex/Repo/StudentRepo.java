package com.DataJpaex.Repo;

import org.springframework.data.repository.CrudRepository;

import com.DataJpaex.Entity.Student;

public interface StudentRepo extends CrudRepository<Student,Integer> {

}
