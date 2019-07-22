package com.scrut.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrut.DAO.UserDAOImpl;
import com.scrut.model.User;

@Service
public class UserSrviceImpl implements UserService {
	
	@Autowired
	private UserDAOImpl UserDAO;

	@Transactional
	public User checkUser(User theUser) {
		return UserDAO.checkUser(theUser);
	}

}
