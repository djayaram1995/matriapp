package com.aream.matriapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aream.matriapp.models.Users;
import com.aream.matriapp.repository.UserDetailRepository;

@RestController
public class SignUpController {
	@GetMapping
	public String signUp(@RequestParam String sign) {
		return sign;

	}
	 @Autowired
	  private UserDetailRepository repository;
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Users> getAllPets() {
	    return repository.findAll();
	  }

	 
}
