package com.example.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.backend.model.Form;
import com.example.backend.model.formResponse;
import com.example.backend.service.FormRecognition;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FileUploadController
{
	@RequestMapping(value = "/upload", produces = {
	        MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
	public formResponse upload(@RequestParam("image") MultipartFile[] image){
		System.out.println("params: emtry");
	 try {
		 formResponse form = FormRecognition.getInfoClientFromRne(image[0]);		
		System.out.println("params: " + form);		
		return form;		
	}
	catch (Exception e) {
        e.printStackTrace();
        return null;
}
}
}