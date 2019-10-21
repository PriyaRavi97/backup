package com.example.demo.interfce;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Employee;

@FeignClient(name="employee-ws")
public interface EmployeeInterface {

	@LoadBalanced
	@GetMapping("/list")
	public List<Employee> findEmployee();
	
	@LoadBalanced
	@GetMapping("/id/{id}")
	public Employee findByAssociateId(@PathVariable("id") int id);

	@LoadBalanced
	@GetMapping("/name/{name}")
	public Employee findByAssociateName(@PathVariable("name") String name);

	@LoadBalanced
	@GetMapping("/email/{email}")
	public Employee findByMailId(@PathVariable("email") String email);

	@LoadBalanced
	@GetMapping("/mobile/{mobile}")
	public Employee findByMobileNumber(String mobile);

	
}