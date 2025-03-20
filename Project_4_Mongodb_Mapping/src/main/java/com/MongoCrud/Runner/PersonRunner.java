package com.MongoCrud.Runner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.MongoCrud.document.DrivingLicense;
import com.MongoCrud.document.Person;
import com.MongoCrud.service.AprtcService;

@Component
public class PersonRunner implements CommandLineRunner {

	@Autowired
	private AprtcService aps;
	@Override
	public void run(String... args) throws Exception {
//		Person p1 = new Person("Saikumar","Hyderabad");
//		
//		DrivingLicense dl = new DrivingLicense("123456L","2-wheeler",LocalDate.now());
//		
//		p1.setLicenseDetails(dl);
//		
//		System.out.println(aps.registerPersonwithDrivingLicense(p1));
		//parent to child
//		aps.fetchAllDateFromPerson().forEach(per->{
//			System.out.println("Parent : " + per);
//			DrivingLicense license = per.getLicenseDetails();
//			System.out.println(license);
//		});
//		
		//child to parent
		
		aps.fetchAllDataFromDrivingLicence().forEach(dri->{
			System.out.println("Child : " + dri);
			Person p1 = dri.getPersonDetails();
			System.out.println(p1);
		});
		
	}
}
