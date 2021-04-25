package com.Radius1.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class Departmant {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long code;
	@Column(unique = true)
	private String department ;
    
	@OneToMany(targetEntity = Employee.class, mappedBy = "dp" ,cascade = CascadeType.ALL)
	private List<Employee> emp;

	
	
	public Departmant(long code, String department, List<Employee> emp) {
		super();
		this.code = code;
		this.department = department;
		this.emp = emp;
	}
//	@JsonManagedReference
	@JsonIgnoreProperties("dp")
	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	

	

	public Departmant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
