package com.Radius1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Radius1.Entity.Departmant;
import com.Radius1.Entity.Employee;
import com.Radius1.service.EmployeeService;

@RestController
@RequestMapping(value="api")
public class EmployeeController {
	@Autowired
	EmployeeService empServ;
	
	
	@GetMapping("/all")
	public List<Employee> getallEmployee()
	{
		return empServ.allData();
	}
	@GetMapping("/age/")
	public List<Employee> getageEmployee(@RequestParam int age)
	{
		return empServ.ageData(age);	}
	
	@GetMapping("salary/{salary}")
	public List<Employee> getsalaryemp(@PathVariable int salary){
		return empServ.salaryData(salary);
		
	}
	
	@PostMapping("/save")
	public Employee create(Employee emp) throws Exception
	{
		System.out.println("Employee Controller");
		Employee create1 = empServ.add(emp);
		return create1;
	}
	
	
	
	
	
	
	@GetMapping("/all1")
	public List<Departmant> GetallDep()
	{
		return empServ.alldpData();
	}
	@PostMapping("/save1")
	public ResponseEntity<Departmant> create2(Departmant dp) throws Exception
	{
		Departmant ct = empServ.add1(dp);
		return new ResponseEntity<Departmant>(ct,new HttpHeaders(), HttpStatus.OK);
	}
}
