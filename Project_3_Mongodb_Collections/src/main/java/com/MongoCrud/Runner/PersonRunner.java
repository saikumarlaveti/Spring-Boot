package com.MongoCrud.Runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.MongoCrud.document.Person;
import com.MongoCrud.service.PersonService;

@Component
public class PersonRunner implements CommandLineRunner {

	@Autowired
	public PersonService person;
	@Override
	public void run(String... args) throws Exception {
		
		String name = "Saikumar Laveti";
		
		String[] favNames = {"Lokesh","Pradeep","Satish","Denish"};
		
		Set<Long> ph_No = new HashSet();
		ph_No.add(7995663051L);
		ph_No.add(8501905061L);
		ph_No.add(9676367486L);
		
		Map<Integer,String> familynames = new HashMap<Integer, String>();
		familynames.put(1, "Appala Naidu ");
		familynames.put(2, "Rajeswari");
		familynames.put(3, "Santosh");
		familynames.put(4, "Hema");
		familynames.put(5, "Saikumar");
		
		Person p = new Person(null,name,favNames,ph_No,familynames);
		
		String result = person.registerPerson(p);
		System.out.println(result);
	}

}
