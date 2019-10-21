package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;
import com.example.demo.model.CreateEmployeeRequestModel;
import com.example.demo.model.CreateEmployeeResponseModel;
import com.example.demo.service.EmpService;
import com.example.demo.shared.EmployeeDto;


@RestController
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmpService employeeService;
	
	@Autowired
	public EmployeeController() {
		super();
	}
	
	
	public EmployeeController(EmpService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	List<Employee> list = new ArrayList<Employee>();
	
	@RequestMapping("/")
	public String home()
	{
		return "ok";
	}
	
	
	@GetMapping("/list")
	public List<Employee> getEmployee(Model model){
		List<Employee> users = employeeService.getAllUsers();
		return users;
	}
		
	@GetMapping("/id/{id}")
	public Employee findemployee(@PathVariable("id") int empId){
		Employee emp = employeeService.findEmployee(empId);
		return emp;
	}
	
	@PutMapping("/update/{uId}")
	public ResponseEntity<CreateEmployeeResponseModel> updateEmployee(@RequestBody CreateEmployeeRequestModel empDto, @PathVariable("uId") String empId){
		ModelMapper mapper = new ModelMapper();
		EmployeeDto empDto2 = mapper.map(empDto,EmployeeDto.class);
				
		EmployeeDto emp = employeeService.updateEmployee(empDto2,empId);
				CreateEmployeeResponseModel model = mapper.map(emp, CreateEmployeeResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);	
	}
	
	
	@GetMapping("/name/{associateName}")
	public ResponseEntity<CreateEmployeeResponseModel> findEmployeeByName(@PathVariable("associateName") String empName){
		ModelMapper mapper = new ModelMapper();
		Employee emp = employeeService.findEmployeeByName(empName);
				CreateEmployeeResponseModel model = mapper.map(emp, CreateEmployeeResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);	
	}
	
	@GetMapping("/email/{mailId}")
	public ResponseEntity<CreateEmployeeResponseModel> findEmployeeByMail(@PathVariable("mailId") String empMail){
		ModelMapper mapper = new ModelMapper();
		Employee emp = employeeService.findEmployeeByMail(empMail);
				CreateEmployeeResponseModel model = mapper.map(emp, CreateEmployeeResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);	
	}
	
	@GetMapping("/mobile/{mobileNumber}")
	public ResponseEntity<CreateEmployeeResponseModel> findEmployeeByNumb(@PathVariable("mobileNumber") String empNumb){
		ModelMapper mapper = new ModelMapper();
		Employee emp = employeeService.findEmployeeByNumb(empNumb);
				CreateEmployeeResponseModel model = mapper.map(emp, CreateEmployeeResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);	
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<CreateEmployeeResponseModel> create(@RequestBody CreateEmployeeRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		EmployeeDto uDto=mapper.map(userDetail, EmployeeDto.class);
		uDto.setuId(UUID.randomUUID().toString());
		Employee tempDto=employeeService.createEmployee(uDto);
		CreateEmployeeResponseModel model=mapper.map(tempDto, CreateEmployeeResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
	}

}