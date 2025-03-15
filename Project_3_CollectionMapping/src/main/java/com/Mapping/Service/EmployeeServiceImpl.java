package com.Mapping.Service;

import java.beans.Transient;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mapping.Entity.Employee;
import com.Mapping.Repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo emp;
	@Override
	public String RegisterEmpolyee(Employee e) {
		//emp.save(e);
		//return "Employee with ID " +" " + emp.save(e) + " "+e.getEid() + " Saved Successfully";
		Employee savedEmployee = emp.save(e);  // Save the entity to the database
        return "Employee with ID " + savedEmployee.getEid() + " Saved Successfully";
	}

	@Override
	@Transactional
	public List<Employee> fetchData() {
		List<Employee> e1 = emp.findAll();
		return e1;
	}

}
