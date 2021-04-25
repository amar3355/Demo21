package com.Radius1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Radius1.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	//@Query("select u from User u where u.email = :email")

public User findByEmail(String email) ;

}