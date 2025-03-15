package com.Mapping.Runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Mapping.Entity.Employee;
import com.Mapping.Repo.EmployeeRepo;
import com.Mapping.Service.EmployeeService;
@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	private EmployeeService ref;
	@Override
	public void run(String... args) throws Exception {
		List<String> friends = new ArrayList<>();
		friends.add("Saikumar Laveti");
		friends.add("Santosh Laveti");
		friends.add("Naresh");
		
		Set<Long> ph_No = new HashSet<Long>();
		ph_No.add(799566L);
		ph_No.add(967636L);
		
		Map<String,Integer> id = new HashMap<String, Integer>();
		id.put("aadhar",6629);
		id.put("Voter",2120);
		
		Employee e1 = new Employee(1,"Saikumar Laveti", friends,ph_No,id);
		System.out.println(ref.RegisterEmpolyee(e1));
		List<Employee> result = ref.fetchData();
		System.out.println(result);
		
		
	}

}
