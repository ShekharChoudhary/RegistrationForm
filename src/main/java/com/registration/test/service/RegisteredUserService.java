package com.registration.test.service;

import java.util.List;

import com.shekhar.registration.model.UserDetails;

public interface RegisteredUserService {

	void saveUser(UserDetails user);
	List<UserDetails> findAllUsers();
}
