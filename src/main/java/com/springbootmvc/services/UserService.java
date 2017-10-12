package com.springbootmvc.services;

import org.springframework.stereotype.Service;

import com.springbootmvc.model.Login;
import com.springbootmvc.model.User;

/**
 * 
 * @author bhawani.singh
 *
 */

@Service
public interface UserService {

	public User validateUser(Login login);

	public void register(User user);

}
