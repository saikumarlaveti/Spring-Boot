package com.DataJpaex.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJpaex.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
