package com.example.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Form;
import com.example.backend.model.User;
import com.example.backend.service.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService service;
	
	@PostMapping("/signup")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		
		String tempUsername = user.getUsername();
		
		if(tempUsername != null && !"".equals(tempUsername)) {
			User userobj = service.fetchUserByUsername(tempUsername);
			
			if(userobj != null) {
				throw new Exception(""+tempUsername+" is already taken. Please change your username");
			}
			
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/signin")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUsername = user.getUsername();
		String tempPassword = user.getPassword();
		User userObj = null;
		if(tempUsername != null && tempPassword != null) {
			userObj = service.fetchUserByUsernameAndPassword(tempUsername, tempPassword);
			
		}
		
		if (userObj == null) {
			throw new Exception ("Incorrect username or password");
		}
		
		return userObj;
		
	}
	
	@GetMapping("/getusers")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<User> fetchUserList(){
		List<User> users = new ArrayList<User>();
		users = service.fetchuserlist();
		return users;
		
	}
	
	@GetMapping("/getuserbyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public User fetchUserById(@PathVariable long id ){
		return service.fetchUserById(id).get();
		
	}
	
	@GetMapping("/deleteuserbyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String DeleteUserById(@PathVariable long id) {
		return service.deleteUserById(id);
	}
}
