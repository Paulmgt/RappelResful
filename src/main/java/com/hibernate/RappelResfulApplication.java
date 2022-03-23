package com.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.model.Rendez_vous;
import com.hibernate.model.User;
import com.hibernate.service.Rendez_vousService;
import com.hibernate.service.UserService;

@SpringBootApplication
public class RappelResfulApplication implements CommandLineRunner {

	
	@Autowired
	Rendez_vousService rdvService;
	@Autowired
	UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RappelResfulApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		userService.createUser(new User("Dubois", "Henry", "DuboiHer@test.fr", "juliemafemme", 33, "48769997678"));
		userService.createUser(new User("Coiffer", "Silvie", "Silvcoiff@test.fr", "frtonom", 23, "4862976784"));
		userService.createUser(new User("Salome", "Doree", "doresal@test.fr", "volrfg", 28, "7890725273"));
		
		rdvService.createRendez_vous(new Rendez_vous("Medecin", "12/04/2022", "Prise de tension"));
		rdvService.createRendez_vous(new Rendez_vous("Pole emploie", "31/05/2022", "situation"));
		rdvService.createRendez_vous(new Rendez_vous("Retrai de coli", "22/06/2022", "Retrai en magasin"));
	}
	

}
