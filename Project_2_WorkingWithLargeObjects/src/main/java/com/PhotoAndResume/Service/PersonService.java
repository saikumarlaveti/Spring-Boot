package com.PhotoAndResume.Service;

import java.util.List;
import java.util.Optional;

import com.PhotoAndResume.Entity.PersonInfo;
import com.PhotoAndResume.Repo.PersonInfoRepo;

public interface PersonService {
	
	public String registePerson(PersonInfo p);
	
//	public List<PersonInfo> candiateDetails();
	Optional<PersonInfo> getPersonById(Integer id);
}
