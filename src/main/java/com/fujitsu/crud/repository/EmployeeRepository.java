package com.fujitsu.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fujitsu.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

	public List<Employee> findByEmpAgeLessThanEqual(int age);
	public Employee findByEmpNameAndEmpId(String name,int id);
}

 


