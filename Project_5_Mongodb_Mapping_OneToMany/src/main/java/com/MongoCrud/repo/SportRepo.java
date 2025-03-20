package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Sport;

public interface SportRepo extends MongoRepository<Sport, Integer>{

}
