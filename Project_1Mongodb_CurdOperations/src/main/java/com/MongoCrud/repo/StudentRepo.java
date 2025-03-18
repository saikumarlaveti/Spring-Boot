package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Student;

public interface StudentRepo extends MongoRepository<Student, String>{

}
