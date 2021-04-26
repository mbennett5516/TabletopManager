package com.bennett.app.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bennett.app.io.entities.UserEntity;
import com.bennett.app.io.repositories.UserRepository;
import com.bennett.app.services.UserService;
import com.bennett.app.shared.Utils;
import com.bennett.app.shared.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	Utils utils;

	@Override
	public UserDto createUser(UserDto user) {
		
		if(userRepository.findByEmail(user.getEmail()) != null) {
			throw new RuntimeException("Record already exists");
		}
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(user, userEntity);

		userEntity.setUserId(utils.generateUserId(30));
		userEntity.setEncryptedPassword("EncryptedPasswordTest");
		
		UserEntity savedUser = userRepository.save(userEntity);
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(savedUser, returnValue);
		
		return returnValue;
	}

}
