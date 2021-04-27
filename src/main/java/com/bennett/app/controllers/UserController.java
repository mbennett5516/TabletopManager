package com.bennett.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bennett.app.exceptions.UserServiceException;
import com.bennett.app.services.UserService;
import com.bennett.app.shared.dto.UserDto;
import com.bennett.app.ui.models.requests.UserDetailsRequestModel;
import com.bennett.app.ui.models.responses.OperationStatusModel;
import com.bennett.app.ui.models.responses.RequestOperationName;
import com.bennett.app.ui.models.responses.RequestOperationStatus;
import com.bennett.app.ui.models.responses.UserResponse;

@RestController
@RequestMapping("/users") // http://www.localhost:8080/users
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserResponse getUser(@PathVariable String id) {

		UserResponse returnValue = new UserResponse();

		UserDto userDto = userService.getUserByUserId(id);
		BeanUtils.copyProperties(userDto, returnValue);

		return returnValue;
	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserResponse createUser(@RequestBody UserDetailsRequestModel userDetails) throws UserServiceException {
		
		UserResponse returnValue = new UserResponse();

		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);

		UserDto createdUser = userService.createUser(userDto);
		BeanUtils.copyProperties(createdUser, returnValue);

		return returnValue;
	}

	@PutMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public UserResponse updateUser(@PathVariable String id, @RequestBody UserDetailsRequestModel userDetails) {
		
		UserResponse returnValue = new UserResponse();

		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userDetails, userDto);

		UserDto updatedUser = userService.updateUser(id, userDto);
		BeanUtils.copyProperties(updatedUser, returnValue);

		return returnValue;
	}

	@DeleteMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public OperationStatusModel deleteUser(@PathVariable String id) {
		
		OperationStatusModel returnValue = new OperationStatusModel();
	
		returnValue.setOperationName(RequestOperationName.DELETE.name());
		
		userService.deleteUser(id);
		
		returnValue.setOperationResult(RequestOperationStatus.SUCCESS.name());
		
		return returnValue;
	}

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<UserResponse> getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
										@RequestParam(value = "limit", defaultValue = "25") int limit) {
		
		List<UserResponse> returnValue = new ArrayList<>();
		
		List<UserDto> users = userService.getUsers(page, limit);
		
		for (UserDto user: users) {
			UserResponse userModel = new UserResponse();
			BeanUtils.copyProperties(user, userModel);
			returnValue.add(userModel);
		}
		return returnValue;
	}
}
