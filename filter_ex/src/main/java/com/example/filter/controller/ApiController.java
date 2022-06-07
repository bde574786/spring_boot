package com.example.filter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.filter.dto.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("/user")
	public String user() {
		
		log.info("API controller에서 코드 실행");
		return "user ok";
	}
	
	@PostMapping("/user")
	public User user(@RequestBody User user) {
		
		log.info("user : {}", user);
		return user;
		
	}
	
}
