package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.shared.EmployeeDto;
import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Skill;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.SkillRepository;

@Service
public class EmployeeServiceImpl implements EmpService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private SkillRepository skillRepository;
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getAllUsers() {
		List<Employee> users=(List<Employee>) employeeRepository.findAll();
		return users;
	}
	
	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAssociateId(empId);
	}

	@Override
	public Employee createEmployee(EmployeeDto uDto) {
		// TODO Auto-generated method stub
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Employee employee = mapper.map(uDto, Employee.class);;
		return employeeRepository.save(employee);
	}

	@Override
	public Employee findEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAssociateName(empName);
	}

	@Override
	public Employee findEmployeeByMail(String empMail) {
		// TODO Auto-generated method stub
		return employeeRepository.findByMailId(empMail);
	}

	@Override
	public Employee findEmployeeByNumb(String empNumb) {
		// TODO Auto-generated method stub
		return employeeRepository.findByMobileNumber(empNumb);
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto edto , String empId) {
		Employee e = null;
		
		Optional<Employee> op = employeeRepository.findByuId(empId);
		if(op.isPresent()) {
			e = op.get();
			e.setAssociateName(edto.getAssociateName());
			e.setMailId(edto.getMailId());
			e.setMobileNumber(edto.getMobileNumber());
			e.setSkill(edto.getSkill());
			employeeRepository.save(e);
		}
			
		ModelMapper mapper1 = new ModelMapper();
		mapper1.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto dto1 = mapper1.map(e,EmployeeDto.class);
		return dto1;
	}
	
}
