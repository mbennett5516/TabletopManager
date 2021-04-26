package com.bennett.app.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bennett.app.services.UserService;
import com.bennett.app.shared.dto.UserDto;
import com.bennett.app.ui.models.requests.UserDetailsRequestModel;
import com.bennett.app.ui.models.responses.UserResponse;

@RestController
@RequestMapping("/users") // http://www.localhost:8080/users
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
	public UserResponse getUser(@RequestParam String id){
		return null;
	}
	
	@PostMapping
	public UserResponse createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		UserResponse returnValue = new UserResponse();
		
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);
		
		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);
		
		return returnValue;
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
