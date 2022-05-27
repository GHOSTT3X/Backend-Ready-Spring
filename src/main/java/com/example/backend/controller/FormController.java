package com.example.backend.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.backend.model.Form;
import com.example.backend.service.FormService;

@RestController
public class FormController {
	@Autowired
	private FormService service;
	

	@GetMapping("/getformlist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Form> fetchFormList(){
		List<Form> forms = new ArrayList<Form>();
		//logic to fetch list from database here!
		forms = service.fetchformlist();
		return forms;
	}
	
	@PostMapping("/addform")
	@CrossOrigin(origins = "http://localhost:4200")
	public Form saveForm(@RequestBody Form form) {
		return service.saveFormToDB(form);
		
	}
	
	@GetMapping("/getformbyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Form fetchFormById(@PathVariable long id ){
		return service.fetchFormById(id).get();
		
	}
	
	@DeleteMapping("/deleteformbyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String DeleteFormById(@PathVariable long id) {
		return service.deleteFormById(id);
	}
	
	@PutMapping("/updateform")
	@CrossOrigin(origins = "http://localhost:4200")
	public Form update(@RequestBody Form form) {
		return service.saveFormToDB(form);
	}
	
	
	
	
}
	
	
