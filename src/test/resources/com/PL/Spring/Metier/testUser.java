package com.PL.Spring.Metier;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Vector;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.PL.Spring.Entities.Role;
import com.PL.Spring.Entities.User;

public class testUser {

	@Autowired
	private static ClassPathXmlApplicationContext context;
	private static UserServiceInt metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		metier=(UserServiceInt) context.getBean("metier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAddUser() {
		/*
		User u=new User();
		
		Role r=new Role();
		r.setRoleName("ROLE_STUDENT");
		
		Collection<Role> c;
		c=new Vector<Role>();
		c.add(r);
		
		u.setActived(true);
		u.setUser_name("toto");
		u.setRoles(c);
		
		metier.addUser(u);
		*/
		
	}

	@Test
	public void testEditUser() {
		/*
		User u=metier.findUserByName("toto");
		u.setPassword("toto");
		metier.editUser(u);
		*/
	}

	@Test
	public void testDeleteUser() {
		metier.deleteUser(new Long(5));
	}

	@Test
	public void testFindUser() {
		System.out.println("Utilisateur => " + metier.findUser(new Long(2)));
	}

	@Test
	public void testFindUserByName() {
		//System.out.println(metier.findUserByName("admin1"));
	}

	@Test
	public void testGetAllUsers() {
		System.out.println("*** \n"+metier.getAllUsers()+" \n***");
	}

}
