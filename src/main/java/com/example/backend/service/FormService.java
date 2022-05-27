package com.example.backend.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.example.backend.model.Form;
import com.example.backend.repository.formRepository;


@Service
public class FormService {
	
	@Autowired
	private formRepository repo;
	
	public List<Form> fetchformlist(){
		return repo.findAll();
	}
	
	public Form saveFormToDB(Form form) {
		return repo.save(form);
	}
	
	public Optional<Form> fetchFormById(Long id) {
		return repo.findById(id) ;
	}
	
	public String deleteFormById(Long id) {
		String result;
		try {
			repo.deleteById(id);
			result = "Form Deleted Successfully";
		}
		
		catch(Exception e){	
			result = "Form not found with requested ID";
			
		}
		
		return result;
	}
	
	public Form updateForm(Form form) {
			return repo.save(form);
		}	
}
