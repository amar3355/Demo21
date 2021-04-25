package com.Radius1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Radius1.Entity.Departmant;

@Repository
public interface DepartmentRepo extends JpaRepository<Departmant, Long> {

}
