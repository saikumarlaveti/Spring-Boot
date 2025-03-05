package com.Operations;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Operations.Entity.Books;

public interface BookRepo extends JpaRepository<Books, Integer> {
	

}
