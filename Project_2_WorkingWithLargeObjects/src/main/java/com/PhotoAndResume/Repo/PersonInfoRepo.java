package com.PhotoAndResume.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PhotoAndResume.Entity.PersonInfo;

public interface PersonInfoRepo extends JpaRepository<PersonInfo, Integer> {
	
	

}
