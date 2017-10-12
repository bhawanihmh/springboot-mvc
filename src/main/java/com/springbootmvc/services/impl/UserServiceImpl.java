package com.springbootmvc.services.impl;


import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.springbootmvc.model.Login;
import com.springbootmvc.model.User;
import com.springbootmvc.services.UserService;

/**
 * 
 * @author bhawani.singh
 *
 */

@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());
	
	/**
	 * 
	 */
	private static HashMap<String, User> users = new HashMap<String, User>();
	

	/**
	 * 
	 * @param login
	 * @return
	 */
	public User validateUser(Login login) {
		
		LOGGER.info("User Name = " + login.getUserName());
		
		return users.get(login.getUserName());
	}

	/**
	 * 
	 * @param user
	 */
	public void register(User user) {
		LOGGER.info("Registered User Name = " + user.getUserName());
		users.put(user.getUserName(), user);		
	}

	
	
}
