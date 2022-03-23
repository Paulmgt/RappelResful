package com.hibernate.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Rendez_vous implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String titre;

	private String date;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Rendez_vous [id=" + id + ", titre=" + titre + ", date=" + date + ", description=" + description + "]";
	}

	public Rendez_vous(int id, String titre, String date, String description) {
		
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.description = description;
	}

	public Rendez_vous() {

	}

	public Rendez_vous(String titre, String date, String description) {
		
		this.titre = titre;
		this.date = date;
		this.description = description;
	}
	
	

	
	
	
}
