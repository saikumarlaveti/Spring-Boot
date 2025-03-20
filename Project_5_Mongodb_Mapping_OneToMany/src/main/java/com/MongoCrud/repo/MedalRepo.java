package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Medal;

public interface MedalRepo extends MongoRepository<Medal, Integer>{

}
