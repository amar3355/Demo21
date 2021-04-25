package com.Radius1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Radius1.Entity.User;
import com.Radius1.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	@GetMapping("/all")
	public List<User> getalluser() {
		List<User> list = null;
		list = userService.getAllUser();
		return list;

	}

	public UserController() {
		System.out.println("controlleller called");
	}

	@Autowired
	UserService userService;

	@GetMapping("/email/{email}")
	public User getUser(@PathVariable String email) {

		User user = userService.getbyUsername(email);
		return user;

	}

	@GetMapping("/name")
	public Map<String, String> getName() {
		Map mp1 = userService.restdata();
		return mp1;
	}

	/*
	 * @GetMapping("/{id}") public User getUserById( int id) { User user =
	 * userService.getUserById(id); return user;
	 * 
	 * 
	 * }
	 */

	@PostMapping("/add1")
	public User update(User user) {
		User user1 = userService.update(user);
		return user1;

	}

	@GetMapping("/user1")
	public String User1() {
		String text = "Welocome to User 1111111 Page ";
		return text;

	}

	@GetMapping("/user2")
	public String User2() {
		String text = "Please LogIn ";
		return text;

	}

	@GetMapping("/admin2")
	public String admin2() {
		String text = "Welocome to Admin+++++ 2222222 Page ";
		return text;

	}

	@GetMapping("/admin1")
	public String admin() {
		String text = "Welocome to Admin+++++ 11111111 Page ";
		return text;

	}

}
