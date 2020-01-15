package com.ak4.auth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {
	
	@PostMapping("/authorize")
	public boolean authorize(Authentication auth) {
		boolean authorized = false;
		if(auth != null) {
			authorized = true;
		}
		return authorized;
	}
}
