package com.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.hibernate.model.Rendez_vous;

public interface Rendez_vousInterface extends JpaRepository<Rendez_vous, Integer> {

	List<Rendez_vous> findByTitre(String titre);
	
	@Query("Select r From Rendez_vous r WHERE r.description LIKE '%  %'")
	List <Rendez_vous> findContenue();
	
	
	
}
