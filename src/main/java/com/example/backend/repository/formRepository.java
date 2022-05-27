package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Form;

@Repository
public interface formRepository extends JpaRepository<Form, Long> {

}
