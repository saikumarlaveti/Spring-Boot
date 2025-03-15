package com.Mapping.Service;

import java.util.List;

import com.Mapping.Entity.Employee;

public interface EmployeeService {
	
	public  String RegisterEmpolyee(Employee e);
	
	public List<Employee> fetchData();

}
