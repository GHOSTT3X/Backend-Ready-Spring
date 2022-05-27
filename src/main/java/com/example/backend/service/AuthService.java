package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.Form;
import com.example.backend.model.User;
import com.example.backend.repository.AuthRepository;

@Service
public class AuthService {
	
	@Autowired
	private AuthRepository repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByUsername(String username) {
		return repo.findByUsername(username);
	}
	
	public User fetchUserByUsernameAndPassword(String username, String password) {
		return repo.findByUsernameAndPassword(username, password);
	}
	
	public List<User> fetchuserlist(){
		return repo.findAll();
	}
	
	public Optional<User> fetchUserById(Long id) {
		return repo.findById(id) ;
	}
	
	public String deleteUserById(Long id) {
		String result;
		try {
			repo.deleteById(id);
			result = "User Deleted Successfully";
		}
		
		catch(Exception e){	
			result = "User not found with requested ID";
			
		}
		
		return result;
	}
}
	
