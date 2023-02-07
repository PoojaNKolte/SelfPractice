package com.fujitsu.crud.service;

import java.util.List;

import com.fujitsu.crud.model.Employee;

public interface EmployeeService {

	
	
	public Employee saveEmployee(Employee employee);
	public List<String> saveMultiEmployee(List<Employee> employees);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployee();
	public List<Employee> findByAgeLessThanOrEqual(int age);
	public Employee loginCheck(String name,int id);
	public Employee update(Employee employee);
	public List<Employee> updateMultiple(List<Employee> employees);
	public Employee delete(int id);
	public void deleteAll();
}


