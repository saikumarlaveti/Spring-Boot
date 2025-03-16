package com.Mapping.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.Entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
