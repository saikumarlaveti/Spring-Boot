package com.Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Crud.Entity.Family;

import jakarta.transaction.Transactional;

//@Transactional
public interface FamilyRepo extends JpaRepository<Family, Integer>{
	
	@Transactional
	@Modifying
	@Query("update Family set name =:newName where id =:id")
	public int updateId(String newName ,int id);
	
	@Transactional
	@Modifying
	@Query("delete from Family where id >=:start and id <=:end ")
	public int deleteBetweenRange(int start ,int end);

}
