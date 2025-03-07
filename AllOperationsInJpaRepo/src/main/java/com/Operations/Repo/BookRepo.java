package com.Operations.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Operations.Entity.Books;

import jakarta.transaction.Transactional;

public interface BookRepo extends JpaRepository<Books, Integer> {
	
	@Modifying
	@Transactional
	@Query("update Books set BookName =:name where id =:id")
	public int changeName(String name ,int id);
	
	@Transactional
	@Modifying
	@Query("delete from Books where id =:id")
	public int deleteBook(int id);


}
