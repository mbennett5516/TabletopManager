package com.bennett.app.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bennett.app.ui.models.requests.UserDetailsRequestModel;
import com.bennett.app.ui.models.responses.UserResponse;

@RestController
@RequestMapping("/users") // http://www.localhost:8080/users
public class UserController {

	@GetMapping
	public String getUser() {
		return "Get User was called";
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserDetailsRequestModel userDetails) {
		return "Create User was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "Update User was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete User was called";
	}
}
