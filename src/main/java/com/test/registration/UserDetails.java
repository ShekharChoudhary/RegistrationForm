package com.test.registration;

public class UserDetails {

	String firstName;
	String secondName;
	int phoneNumber;
	String address;
	
	public UserDetails(String firstName,
					String secondName,
					int phoneNumber,
					String address){
		this.firstName = firstName;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
}
