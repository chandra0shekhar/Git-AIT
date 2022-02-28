package com.tqpp.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.dao.UserDao;
import com.tqpp.model.User;

@Service
public class UserServiceImpl implements UserService
{
@Autowired
private UserDao userdao;
	
	@Override
	public boolean insertUser(User u) {
		userdao.insertUser(u);
		return true;
	}

	@Override
	public boolean deleteUserById(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByNameAndPassword(String name, String password) {
		User u=userdao.getUserByNameAndPassword(name, password);
		return u;
	}
	
}