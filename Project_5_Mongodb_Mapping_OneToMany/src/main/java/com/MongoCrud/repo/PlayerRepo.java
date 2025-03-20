package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.Player;

public interface PlayerRepo extends MongoRepository<Player, String>{

}
