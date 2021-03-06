package com.springbootmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springbootmvc.model.User;
import com.springbootmvc.services.impl.UserServiceImpl;

/**
 * 
 * @author bhawani.singh
 *
 */

@Controller
public class RegistrationController {
	@Autowired
	public UserServiceImpl userService;

	private static final Logger LOGGER = Logger.getLogger(RegistrationController.class.getName());
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") User user) {
		LOGGER.info("user.getFirstName() = " + user.getFirstName());
		userService.register(user);
		return new ModelAndView("welcome", "firstName", user.getFirstName());
	}
}