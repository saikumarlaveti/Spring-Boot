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

//		PhoneNumber p1 = new PhoneNumber();
//		p1.setPhoneNumber(7995663051L);
//		p1.setProvider("Jio");
//		
//		PhoneNumber p2 = new PhoneNumber();
//		p2.setPhoneNumber(8501905061L);
//		p2.setProvider("Airtel");
//		
//		Person per = new Person();
//		per.setPname("Saikumar Laveti");
//		per.setAge(23);
//		per.setPhoneInfo(Set.of(p1,p2));
//		
//		String result = service.deleteParentAndItsChild(1004);
//		System.out.println(result);
		
		System.out.println("Inner Join");
		service.getDataBy_Inner_Join().forEach(row->{
			for(Object val:row) {
				System.out.print(val + " ");
			}
			System.out.println();
		});
		System.out.println("left Join");
		service.getDataBy_Left_Join().forEach(row->{
			for(Object val:row) {
				System.out.print(val + " ");
			}
			System.out.println();
		});
		System.out.println("right Join");
		service.getDataBy_Right_Join().forEach(row->{
			for(Object val:row) {
				System.out.print(val + " ");
			}
			System.out.println();
		});
//		System.out.println("full join");
//		service.getDataBy_Full_Join().forEach(row->{
//			for(Object val:row) {
//				System.out.print(val + " ");
//			}
//			System.out.println();
//		});
		
	}

}
