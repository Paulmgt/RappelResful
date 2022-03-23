package com.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.User;

public interface UserInterface extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);
	List<User> findByNomOrPrenom(String nom, String prenom);
	List<User> findByAgeOrderByAgeAsc(int age);
	
}
