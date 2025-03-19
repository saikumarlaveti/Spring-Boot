package com.MongoCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoCrud.document.Person;
import com.MongoCrud.repo.LicenceRepo;
import com.MongoCrud.repo.PersonRepo;
import com.MongoCrud.document.DrivingLicence;


@Service("RtoService")
public class RtoServiceImpl implements RtoServices{
	
	@Autowired
	private PersonRepo pr;
	
	@Autowired
	private LicenceRepo dl;

	@Override
	public String personRegister(Person p) {
		return pr.save(p).getId()+" successfully register";
	}

	@Override
	public String DrivingLicenceRegister(DrivingLicence d) {
		return dl.save(d).getId()+"successfully register";
	}

}
