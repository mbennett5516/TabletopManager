package com.bennett.app.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters") // http://www.localhost:8080/characters
public class CharacterController {

	@GetMapping
	public String getCharacter() {
		return "Get Character was called";
	}
	
	@PostMapping
	public String createCharacter() {
		return "Create Character was called";
	}
	
	@PutMapping
	public String updateCharacter() {
		return "Update Character was called";
	}
	
	@DeleteMapping
	public String deleteCharacter() {
		return "Delete Character was called";
	}
}
