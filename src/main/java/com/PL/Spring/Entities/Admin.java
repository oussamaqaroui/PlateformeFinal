package com.PL.Spring.Entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Admins")
@PrimaryKeyJoinColumn(name="user_id")
public class Admin extends User implements Serializable {
	private static final long serialVersionUID = -3939879473294951527L;
	
	
	@NotEmpty
	private String nom;
	@Override
	public String toString() {
		return "Admin [nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", photo=" + Arrays.toString(photo) + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", dateCreation="
				+ dateCreation + ", dateModification=" + dateModification + "]";
	}

	@NotEmpty
	private String prenom;
	@NotEmpty
	private String email;
	@Lob
	private byte[] photo;
	
	private Date dateNaissance;
	
	private String adresse;
	
	private Date dateCreation;
	
	private Date dateModification;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Admin(String username, String password, boolean actived,String nom, String prenom, String email, byte[] photo,
			Date dateNaissance, String adresse, Date dateCreation,
			Date dateModification) {
		super(username, password, actived);
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}
