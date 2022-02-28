package com.tqpp.Service;

import java.util.List;

import com.tqpp.model.User;

public interface UserService {

	boolean insertUser(User u);

	boolean deleteUserById(int uid);

	boolean updateUser(User u);

	List<User> getAllUsers();

	User getUserById(int id);
	
	User getUserByNameAndPassword(String name,String password);

}

