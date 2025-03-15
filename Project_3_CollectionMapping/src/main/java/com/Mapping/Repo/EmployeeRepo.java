package com.Mapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mapping.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
