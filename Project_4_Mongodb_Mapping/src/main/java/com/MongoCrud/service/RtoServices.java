package com.MongoCrud.service;

import com.MongoCrud.document.Person;
import com.MongoCrud.document.DrivingLicence;


public interface RtoServices {
	
	public String personRegister(Person p);
	
	public String DrivingLicenceRegister(DrivingLicence d);

}
