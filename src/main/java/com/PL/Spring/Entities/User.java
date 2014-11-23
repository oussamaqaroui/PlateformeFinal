package com.PL.Spring.Entities;



import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

import org.apache.commons.codec.digest.DigestUtils;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="users")
public class User implements Serializable{
	private static final long serialVersionUID = 5586691367497742578L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long idUser;
	@Column(name="user_name")
	private String user_name;
	private String password;
	private boolean actived;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL) // eager parce qu'il ne trouve pas les role et cascade problème d'enregistrement des fils avant le père
	@JoinColumn(name="user_id")
	private Collection<Role> roles;
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String username) {
		this.user_name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = DigestUtils.md5Hex( password ); // Hashage
		//this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, boolean actived) {
		super();
		this.user_name = username;
		this.password = DigestUtils.md5Hex( password ); // Hashage
		//this.password = password; // a vérifier
		this.actived = actived;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", user_name=" + user_name
				+ ", password=" + password + ", actived=" + actived
				+ ", roles=" + roles + "]";
	}
	
	

}
