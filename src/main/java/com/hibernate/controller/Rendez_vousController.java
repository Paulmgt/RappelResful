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


import com.hibernate.model.Rendez_vous;
import com.hibernate.service.Rendez_vousService;

@RestController
public class Rendez_vousController {
	
	@Autowired
	Rendez_vousService rendezvousService;
	
	@GetMapping("rendezvous/{titre}")
	public List<Rendez_vous> gettitre(@PathVariable String titre)
	{
		return rendezvousService.filtretitre(titre);
		
	}
	
	@GetMapping("rendezvous/{contenue}")
	public List<Rendez_vous> getcontenue( @PathVariable String contenue) 
	{
		return rendezvousService.searchContenue();

	} 
	
	@PostMapping("rendezvous")
	public Rendez_vous saveOne(@RequestBody @Valid Rendez_vous rendez_vous)
	{
		return rendezvousService.createRendez_vous(rendez_vous);
	}
	@DeleteMapping("rdv/{id}")
	public void Deleterendez_vous(@PathVariable int id)
	{
	rendezvousService.delete(id);	
	}

}
