package com.Radius1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Radius1.Entity.Departmant;
import com.Radius1.Entity.Employee;
import com.Radius1.repository.DepartmentRepo;
import com.Radius1.repository.EmpRepo;

@Service
public class EmployeeService  {

	@Autowired
	EmpRepo empRepo;
	@Autowired
	DepartmentRepo dpRepo;

	public List<Employee> allData() {

		List lst = empRepo.findAll();
		return lst;
	}

	public List<Employee> ageData(int j) {

		List lt = empRepo.findByAgeLessThan(j);
		return lt;
	}

	public List<Employee> salaryData(int i) {
		List td = empRepo.findBySalaryLessThan(i);
		return td;
	}

	public Employee add(Employee emp) throws Exception {

		return empRepo.save(emp);
	}

	public List<Departmant> alldpData() {
		List lst = dpRepo.findAll();
		return lst;
	}

	public Departmant add1(Departmant dp) throws Exception {

		return dpRepo.save(dp);
	}

}
