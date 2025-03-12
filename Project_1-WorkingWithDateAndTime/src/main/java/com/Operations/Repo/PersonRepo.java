package com.Operations.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Operations.Entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
