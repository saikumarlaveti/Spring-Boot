package com.Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Crud.Entity.Family;

import jakarta.transaction.Transactional;


@Transactional
public interface FamilyRepo extends JpaRepository<Family, Integer>{
	
//	@Modifying
//	@Query(value="insert into family values(?,?,?,?)",nativeQuery = true)
//	public int registerFamily(int id, int age , int d_year,String name);
	
	@Query(value="select now()",nativeQuery=true)
	public String showDate();
	
	@Query(value="create table temp(id int)",nativeQuery=true)
	@Modifying
	public int createTable();
	
	@Query(value="insert into family values(?,?,?,?)",nativeQuery=true)
	@Modifying
	public int insertValues(int id,int age,int d_year,String name);

}
