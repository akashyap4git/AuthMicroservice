package com.ak4.auth.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.ak4.auth.entity.User;
import com.ak4.auth.model.RegistrationDTO;

@Component
public class DataMapper {
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	public User mapTo(RegistrationDTO userDto) {
	    User newUser = new User();
	    newUser.setUsername(userDto.getUsername());
	    newUser.setPassword(bcryptEncoder.encode(userDto.getPassword()));
	    newUser.setFirstName(userDto.getFirstName());
	    newUser.setLastName(userDto.getLastName());
	    newUser.setContactNumber(userDto.getContactNumber());
	    newUser.setRegCode(userDto.getRegCode());
	    newUser.setRole(userDto.getRole());
	    newUser.setLinkedinUrl(userDto.getLinkedinUrl());
	    newUser.setYearsOfExperience(userDto.getYearsOfExperience());
	    newUser.setActive(true);
		return newUser;
	}
}
