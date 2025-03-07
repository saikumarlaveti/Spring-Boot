package com.Operations.Repo;

import org.springframework.data.repository.CrudRepository;

import com.Operations.Entity.Family;

public interface familyRepo extends CrudRepository<Family, Integer> {
}
