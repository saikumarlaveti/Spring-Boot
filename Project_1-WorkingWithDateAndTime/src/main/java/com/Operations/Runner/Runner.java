package com.Operations.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Operations.Entity.Person;
import com.Operations.Service.PersonImplementation;

@Component
public class Runner implements CommandLineRunner{
	
	@Autowired
	private PersonImplementation manager;

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person();
		p.setPname("Saikumar");
		p.setPage(24);
		p.setDob(LocalDate.of(2025, 03, 12));
		p.setTob(LocalTime.of(8, 30));
		p.setDoj(LocalDateTime.of(2025, 03, 12, 9, 30));
		
		manager.personRegister(p);
		manager.fetchDetails();
		
		Person p1 = new Person(2, "Santosh",28,LocalDate.of(2026, 01, 01),LocalTime.of(9, 30),
				LocalDateTime.of(2026, 01,02,10,30));
		manager.personRegister(p1);
		manager.fetchDetails().forEach(r->System.out.println(r));		
			
	}

}
