package com.PL.Spring.Metier;

import java.util.List;

import com.PL.Spring.Entities.User;

public interface UserServiceInt {
	
	void addUser(User user);
	void editUser(User user);
	void deleteUser(Long userId);
	User findUser(Long userId);
	User findUserByName(String username);
	List<User> getAllUsers();

}
