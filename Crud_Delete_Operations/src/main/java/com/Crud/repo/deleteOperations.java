package com.Crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Crud.delete.Student;

//public interface deleteOperations extends JpaRepository<Student, Integer>{
//
//}

public interface deleteOperations extends CrudRepository<Student, Integer>{

}
