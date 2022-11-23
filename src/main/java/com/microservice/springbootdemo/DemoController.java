package com.microservice.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
public class DemoController {
	
	@Autowired 
	DemoService demoService;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/sayHi")
	public String sayHi() {
		return "Hiii From SpringBoot";
		
	}
	
	@GetMapping("/abc")
	public String abc() {
		return "Hey xyz its abc :-)";
	}
	
	@GetMapping("/xyz")
	public String mnc() {
		return "Checking again";
	}
	
//	Dummy code
	@GetMapping("/createEmployee")
		public Employee createEmployee() {
			
			return demoService.createEmployee();
			
		}
	 
	@PostMapping("/registerEmployee")
	public Employee registerEmployee(@RequestBody Employee employee) {
		
		return demoService.registerEmployee(employee);
	}
	
	@GetMapping("/getEmployee/{empId}")
	public Employee getEmployeeDetails(@PathVariable(value="empId") int empId) {
		return demoService.searchEmployee(empId);
	}
	
		
}


