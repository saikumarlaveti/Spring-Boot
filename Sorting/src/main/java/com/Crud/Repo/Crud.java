package com.Crud.Repo;

import org.springframework.data.repository.*;

import com.Crud.Entity.Student;
public interface Crud extends PagingAndSortingRepository<Student, Integer> {

}
