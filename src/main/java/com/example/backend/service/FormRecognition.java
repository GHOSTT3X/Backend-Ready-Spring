package com.example.backend.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.example.backend.model.Form;
import com.example.backend.model.formResponse;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public interface FormRecognition {
	
	public static formResponse getInfoClientFromRne(MultipartFile image)  {
    
        try {

        	formResponse form = new formResponse();
              MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
              
              bodyMap.add("image", new FileSystemResource(convert(image)));
              
              System.out.println("body map ;" + bodyMap.size());
              
              HttpHeaders headers = new HttpHeaders();
              
              headers.setContentType(MediaType.MULTIPART_FORM_DATA);
              
              HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers); 
              
              System.out.println("Headers:  "+requestEntity.getHeaders());      
              
              System.out.println("requestEntity ; "+requestEntity.toString());   
              
              RestTemplate restTemplate = new RestTemplate(); 
  
             
              
              ResponseEntity<formResponse> response = restTemplate.exchange("http://172.20.10.3:3500/upload-image"
            		  , HttpMethod.POST, requestEntity, formResponse.class);      
           
              
              form= response.getBody();      
              
              System.out.println("form ; "+response);   
              
              System.out.println("form ; "+form.getMouaref());
              
              return form;
        } catch (Exception e) {
              e.printStackTrace();
              return null;
        }
   }
   public static File convert(MultipartFile file) {
        File convertFile = new File(file.getOriginalFilename());
        try {
              convertFile.createNewFile();
              FileOutputStream fos = new FileOutputStream(convertFile);
              fos.write(file.getBytes());
              fos.close();
        } catch (IOException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
        }
        return convertFile;
   }
}
