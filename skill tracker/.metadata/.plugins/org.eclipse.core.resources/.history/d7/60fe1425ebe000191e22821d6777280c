package com.example.demo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	Employee findByAssociateId(int empId);
	Employee findByAssociateName(String empName);
	Employee findByMailId(String empMail);
	Employee findByMobileNumber(String empNumb);
	Optional<Employee> findByuId(String empId);
}