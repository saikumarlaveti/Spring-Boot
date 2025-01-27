package com.DataJpa.Repo;

import org.springframework.data.repository.CrudRepository;

import com.DataJpa.Entity.Books;

public interface BookRepository extends CrudRepository<Books, Integer>{

}
