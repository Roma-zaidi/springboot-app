package com.microservice.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Autowired
	EmployeeRepository empRepo;

	public Employee createEmployee() {
		// Adding Hard coded data just for the beginning
		
		Employee emp = new Employee(101, "Romana",20000.00);
		return emp;
		
		
	}

	public Employee registerEmployee(Employee employee) {
		 return   empRepo.save(employee);
	}


	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return empRepo.findById(empId).get();
	}

}
