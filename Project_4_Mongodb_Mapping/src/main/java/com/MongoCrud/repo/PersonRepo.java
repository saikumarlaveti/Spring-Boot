package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Person;

public interface PersonRepo extends MongoRepository<Person, String> {

}
