package com.example.backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.backend.model.User;


@Repository
public interface AuthRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username, String password);

}

