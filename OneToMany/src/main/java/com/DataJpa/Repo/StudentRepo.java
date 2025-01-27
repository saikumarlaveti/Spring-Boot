package com.DataJpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJpa.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
