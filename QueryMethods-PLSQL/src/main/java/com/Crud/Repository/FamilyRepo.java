package com.Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.Crud.Entity.Family;

import jakarta.transaction.Transactional;

public interface FamilyRepo extends JpaRepository<Family, Integer>{
	

}
