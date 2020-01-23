package com.example.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import com.example.rest.webservices.restfulwebservices.user.exception.UserNotFoundException;

@RestController
public class UserService {
	
	@Autowired
	private UserDaoService service;
	
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return service.findAll();
		
	}
	@GetMapping(path="/users/{id}")
	public User getUserById(@PathVariable int id) {
		User user= service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id - "+id);
		}
		//HATEOAS
		/*
		 * EntityModel<User> resource= new EntityModel<User>(user); WebMvcLinkBuilder
		 * linkTo = WebMvcLinkBuilder.linkTo(methodOn(this.getClass()).getAllUsers);
		 * resource.add(linkTo.withRel("all-users"));
		 */
		return user;
	}
	@PostMapping(path="/addUser")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		
		User savedUser = service.save(user);
		// return service.save(user);
		// Status Code - created
		// To Return a proper HTTP status code and what got created uri
		// /user/{id}    savedUSer.getID()
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping("/deleteUserById/{id}")
	public User deleteUserById(@PathVariable int id) {
		User user= service.deleteOne(id);
		if(user == null) {
			throw new UserNotFoundException("id - "+id);
		}
		return user;
	}
}
