package com.MongoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.DrivingLicense;
import com.MongoCrud.document.Person;
import com.MongoCrud.repo.DrivingLicenceRepo;
import com.MongoCrud.repo.PersonRepo;

@Service("rtoService")
public class AprtcServiceImpl implements AprtcService{

	@Autowired
	private PersonRepo person;
	
	@Autowired
	private DrivingLicenceRepo driving;

	@Override
	public String registerPersonwithDrivingLicense(Person per) {
		
		return person.save(per).getId()+" person saved Successfully";
	}

	@Override
	public String registerWithPerson(DrivingLicense license) {
		
		return driving.save(license).getLicenseNo()+" license saved Successfully";
	}

	@Override
	public List<Person> fetchAllDateFromPerson() {
		
		
		return person.findAll();
	}

	@Override
	public List<DrivingLicense> fetchAllDataFromDrivingLicence() {
		
		return driving.findAll();
	}
	
	

}
