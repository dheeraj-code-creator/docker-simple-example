package com.simple.test.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/userinfo")
public class UserController {
	
	@GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
	public String message(){
		return "Hello docker!!!";
	}

}