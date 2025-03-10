package com.Operations.Repo;

import org.springframework.data.repository.CrudRepository;

import com.Operations.Entity.userlist;

public interface UsersRepo extends CrudRepository<userlist, String> {

}
