package com.Operations.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Operations.Entity.Books;

import jakarta.transaction.Transactional;

public interface BookRepo extends JpaRepository<Books, Integer> {
	
}
