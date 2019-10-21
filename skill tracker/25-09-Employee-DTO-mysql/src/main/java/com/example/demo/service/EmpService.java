package com.example.demo.service;

import java.util.List;

import com.example.demo.shared.EmployeeDto;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;


public interface EmpService {
	
	public List<Employee> findAll();
	public Employee findEmployee(String empId);
	public Employee createEmployee(EmployeeDto uDto);
	public Employee findEmployeeByName(String empName);
	public Employee findEmployeeByMail(String empMail);
	public Employee findEmployeeByNumb(String empNumb);
	List<Employee> getAllUsers();
	EmployeeDto updateEmployee(EmployeeDto edto, String empId);
	//void deleteUser(String id);
	//void deleteUser(int id);
}