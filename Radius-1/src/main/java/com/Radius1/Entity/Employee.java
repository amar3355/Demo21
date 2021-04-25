package com.Radius1.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table
//@JsonIdentityInfo( generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee {
	
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private int salary;
	private int age;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn
	//@JsonBackReference
	@JsonIgnoreProperties("emp")
	private Departmant dp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Departmant getDp() {
		return dp;
	}

	public void setDp(Departmant dp) {
		this.dp = dp;
	}

	public Employee(long id, String name, int salary, int age, Departmant dp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dp = dp;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
