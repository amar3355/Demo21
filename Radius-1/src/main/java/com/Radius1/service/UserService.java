package com.Radius1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.Radius1.Entity.User;
import com.Radius1.repository.UserRepository;

import javassist.NotFoundException;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	

	/*<properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
	 * public User getUserById(int id) { Optional<User> find = repo.findById(id); if
	 * (find.isPresent()) { return find.get(); } else { return null; }
	 */
	//}

	public User update(User user) {
		Optional<User> find1 = repo.findById(user.getId());
		System.out.println("user printing in if1111::" + user);

		if (find1.isPresent()) {

			User user1 = find1.get();
			user1.setName(user.getName());
			user1.setEmail(user.getEmail());
			user1.setPassword(user.getPassword());
			user1.setRole(user.getRole());
			user1 = repo.save(user1);
			System.out.println("user printing in if::" + user);
			return user1;

		} else {

			System.out.println("user::" + user);
			user.setName(user.getName());
			user.setEmail(user.getEmail());
			user.setPassword(user.getPassword());
			user.setRole(user.getRole());
			user = repo.save(user);
			return user;
		}

	}
	
	public Map restdata()
	{    List<User> u1=  repo.findAll();
	System.out.println(u1);
			Map<String, String> mp = u1.stream().collect(Collectors
					.toMap(user2->user2.getName(), user1->user1.getEmail()));
	
			return mp;
	}

	public List<User> getAllUser() {
		 List<User> u1=  repo.findAll();
		 List<User> u2= u1.stream().collect(Collectors.toList());
		
		return repo.findAll();
	}
 
 
	public User getbyUsername(String email) {
		return  repo.findByEmail(email);

	/*	if (find == null) {
			return new NotFoundException("not found");
		} else {*/
			

	}

	
	
	 

	/*
	 * User user = null; Optional<User>
	 * find1=repo.getUserByUserName(user.getEmail()); if( find1.isPresent()) {
	 * return find1.get(); } else { System.out.println("no User Aailable"); return
	 * user; }
	 */

}
