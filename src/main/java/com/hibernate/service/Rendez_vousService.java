package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hibernate.model.Rendez_vous;
import com.hibernate.repository.Rendez_vousInterface;

@Service
public class Rendez_vousService {

	@Autowired
	Rendez_vousInterface rendez_vousInterface;
	
	
public Rendez_vous createRendez_vous(Rendez_vous r) {
		
		return  rendez_vousInterface.save(r);
	}
	public List<Rendez_vous> read(){
		
		return rendez_vousInterface.findAll();
	}
	
	public Optional<Rendez_vous> searchById(int id)
	{
		return rendez_vousInterface.findById(id);
		
	}
	public void delete(int id) {
		
		rendez_vousInterface.deleteById(id);
	}
	
	
	public List<Rendez_vous> filtretitre(String titre) {
		
		return rendez_vousInterface.findByTitre(titre);
	}
	
	public List<Rendez_vous> searchContenue()  {
		
	
		return rendez_vousInterface.findContenue();
	}
	

	
}
