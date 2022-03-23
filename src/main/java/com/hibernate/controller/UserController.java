package com.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.hibernate.model.User;
import com.hibernate.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/usermail/{email}")
	public List<User> getemail(@PathVariable String email){
		
		return userService.filtreemail(email);
				
	}
	
	@GetMapping("/user/{nom}/{prenom}")
	public List<User> getnomOrprenom(@PathVariable String nom, String prenom) {
		
		return userService.filtrenomOrprenom(nom, prenom);
		
	}
	
	@GetMapping("/userage/{age}")
	public List<User> getageorderasc(@PathVariable int age) {
		
		return userService.filtreorderage(age);
	}
	
	@PostMapping
	public User saveOne(@RequestBody @Valid User user)
	{
		return userService.createUser(user);
	}
	@DeleteMapping("user/{id}")
	public void DeleteUser(@PathVariable int id)
	{
	userService.delete(id);	
	}
	
}
