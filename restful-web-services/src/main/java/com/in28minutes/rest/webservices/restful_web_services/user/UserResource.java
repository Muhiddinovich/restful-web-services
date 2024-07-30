package com.in28minutes.rest.webservices.restful_web_services.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	private UserDaoService service;
	public UserResource(UserDaoService service) {
		this.service=service;
	}
	
	// GET /users
	@GetMapping("/users")
	public List<User> retreiveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retreiveUser(@PathVariable int id){
		return service.findOne(id);
	}
}
