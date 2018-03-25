package com.registration.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shekhar.registration.model.UserDetails;

@Service("registeredUserService")
@Transactional
public class RegisteredUserServiceImpl implements RegisteredUserService {
	
	private static List<UserDetails> users;
	private static int counter =0;
	
	static{
		users = populateDummyUser();
	}

	public void saveUser(UserDetails user) {

		user.setUserId(counter++);
		users.add(user);
	}

	private static List<UserDetails> populateDummyUser() {

		List<UserDetails> users = new ArrayList<UserDetails>();
		users.add(new UserDetails(counter++, "John", "Smith", 23232323, "USA"));
		users.add(new UserDetails(counter++, "Rene", "Albertsen", 34343434, "FRANCE"));
		return users;
	}

	public List<UserDetails> findAllUsers() {

		return users;
	}

}
