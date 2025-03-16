package com.Mapping.Runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Mapping.Entity.Person;
import com.Mapping.Entity.PhoneNumber;
import com.Mapping.Service.ServiceImpl;

@Component
public class PersonRunner implements CommandLineRunner {
	
	@Autowired
	private ServiceImpl service;
	@Override
	public void run(String... args) throws Exception {
//		Person p = new Person();
//		p.setAge(23);
//		p.setPname("Saikumar");
//		p.setPh_Number(7995663051L);
//		p.setPh_Number(8501905061L);
		
		PhoneNumber p1 = new PhoneNumber();
		p1.setPhoneNumber(7995663051L);
		p1.setProvider("Jio");
		
		PhoneNumber p2 = new PhoneNumber();
		p2.setPhoneNumber(8501905061L);
		p2.setProvider("Airtel");
		
		Person per = new Person();
		per.setPname("Saikumar Laveti");
		per.setAge(23);
		per.setPhoneInfo(Set.of(p1,p2));
		
		System.out.println(service.saveDataUsingParent(per));
	}

}
