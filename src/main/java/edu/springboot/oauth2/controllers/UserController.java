package edu.springboot.oauth2.controllers;

import edu.springboot.oauth2.domains.User;
import edu.springboot.oauth2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/users")
	public Iterable<User> getUsers() {
		return userService.getUsers();
	}

}
