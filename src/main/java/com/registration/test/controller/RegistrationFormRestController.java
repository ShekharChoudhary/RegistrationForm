package com.registration.test.controller;

import org.hsqldb.rights.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.registration.test.service.RegisteredUserService;

@RestController
public class RegistrationFormRestController {
	
	@Autowired
	RegisteredUserService registeredUserService;
	
	 @RequestMapping(value = "/user/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createUser(@RequestBody User user,    UriComponentsBuilder ucBuilder) {
			
		 return null;
		 
	 }
}
