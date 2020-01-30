package com.example.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
public class UserJPAService {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;
	
	@GetMapping(path="/jpa/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
		
	}
	@GetMapping(path="/jpa/users/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		Optional<User> user= userRepository.findById(id);
		if(!user.isPresent()) {
			throw new UserNotFoundException("id - "+id);
		}
		
		return user;
	}
	
	@PostMapping(path="/jpa/addUser")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		
		User savedUser = userRepository.save(user);
		// return service.save(user);
		// Status Code - created
		// To Return a proper HTTP status code and what got created uri
		// /user/{id}    savedUSer.getID()
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping("/jpa/deleteUserById/{id}")
	public void deleteUserById(@PathVariable int id) {
	 userRepository.deleteById(id);
	}
	
	@GetMapping(path="/jpa/users/{id}/posts")
	public List<Post> getPostsofUserById(@PathVariable int id) {
		Optional<User> userOptional= userRepository.findById(id);
		if(!userOptional.isPresent()) {
			throw new UserNotFoundException("id - "+id);
		}
		
		return userOptional.get().getPosts();
	}
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Post> createPosts(@PathVariable int id, @RequestBody Post post){
		
		Optional<User> userOptional= userRepository.findById(id);
		if(!userOptional.isPresent()) {
			throw new UserNotFoundException("id - "+id);
		}
		User user=userOptional.get();
		
		post.setUser(user);

		postRepository.save(post);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("{/id}")
				.buildAndExpand(post.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
}
