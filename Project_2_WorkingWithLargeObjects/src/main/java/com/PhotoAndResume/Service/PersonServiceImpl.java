package com.PhotoAndResume.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PhotoAndResume.Entity.PersonInfo;
import com.PhotoAndResume.Repo.PersonInfoRepo;

@Service("PersonService")
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	public PersonInfoRepo ref;
	@Override
	public String registePerson(PersonInfo p) {
		return ref.save(p).getPid() + "person saved";
	}

//	@Override
//	public List<PersonInfo> candiateDetails() {
//		return ref.findAll();
//	}
//	
	@Override
    public Optional<PersonInfo> getPersonById(Integer id) {
        return ref.findById(id);
    }
}
