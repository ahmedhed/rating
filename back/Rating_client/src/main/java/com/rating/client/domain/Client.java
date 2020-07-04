package com.rating.client.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = -5256109842677679929L;
	@Id
	@GeneratedValue
	private Long id;
	private String identifiant;
	private String nom;
	private String prenom;
	private Integer age;
	private boolean indiceAmericanicite;


    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
	private Profile profile = new Profile();

	
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	

	public boolean isIndiceAmericanicite() {
		return indiceAmericanicite;
	}

	public void setIndiceAmericanicite(boolean indiceAmericanicite) {
		this.indiceAmericanicite = indiceAmericanicite;
	}

	public Client(String identifiant, String nom, String prenom, Integer age, Profile profile) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profile = profile;
	}

	public Client() {
	}

}
