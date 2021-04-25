package com.Radius1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Radius1.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {

	List<Employee> findByAgeLessThan(int age);

	List<Employee> findBySalaryLessThan(int salary);

}
