package com.shekhar.registration.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.shekhar.registration.model.UserDetails;
import com.shekhar.registration.service.RegisteredUserService;

@RestController
public class RegistrationFormRestController {
	
	@Autowired
	RegisteredUserService registeredUserService;
	
	   @RequestMapping(value = "/user/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createUser(@RequestBody UserDetails user,    UriComponentsBuilder ucBuilder) {
	        System.out.println("Creating User " + user.getFirstName());
	 
	        /*if (registeredUserService.isUserExist(user)) {
	            System.out.println("A User with name " + user.getUsername() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }*/
	 
	        registeredUserService.saveUser(user);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getUserId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
	 
}
