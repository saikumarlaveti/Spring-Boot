package com.Crud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Crud.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
