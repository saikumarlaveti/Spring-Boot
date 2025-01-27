package com.DataJpa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DataJpa.Entity.Courses;

public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
