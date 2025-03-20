package com.MongoCrud.service;

import java.util.List;

import com.MongoCrud.document.DrivingLicense;
import com.MongoCrud.document.Person;

public interface AprtcService {

	public String registerPersonwithDrivingLicense(Person per);
	public String registerWithPerson(DrivingLicense license);
	
	public List<Person> fetchAllDateFromPerson();
	public List<DrivingLicense> fetchAllDataFromDrivingLicence();
}