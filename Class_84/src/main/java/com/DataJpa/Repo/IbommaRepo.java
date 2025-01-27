package com.DataJpa.Repo;

import org.springframework.data.repository.CrudRepository;

import com.DataJpa.Entity.Movie;

public interface IbommaRepo extends CrudRepository<Movie, Integer> {

}
