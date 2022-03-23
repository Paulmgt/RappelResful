package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.model.User;
import com.hibernate.repository.UserInterface;

@Service
public class UserService {
	
	@Autowired
	UserInterface userInterface;
	
public User createUser(User r) {
		
		return  userInterface.save(r);
	}
	public List<User> read(){
		
		return userInterface.findAll();
	}
	
	public Optional<User> searchById(int id)
	{
		return userInterface.findById(id);
		
	}
	public void delete(int id) {
		
		userInterface.deleteById(id);
	}
	
	
	public List<User> filtreemail(String email){
		
		return userInterface.findByEmail(email);
	}
	
	public List<User> filtrenomOrprenom(String nom, String prenom){
		
		return userInterface.findByNomOrPrenom(nom, prenom);
	}
	
	public List<User> filtreorderage(int age) {
		
		return userInterface.findByAgeOrderByAgeAsc(age);
	}

}
