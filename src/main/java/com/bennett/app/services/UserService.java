package com.bennett.app.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bennett.app.shared.dto.UserDto;

public interface UserService extends UserDetailsService{

	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String userId, UserDto userDto);
}
