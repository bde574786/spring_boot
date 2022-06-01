package com.example.validation2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.validation2.dto.User;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		return "<h1>hello<h1>";
	}
	
	
	@GetMapping("/user")
	public User user() {
		
		User user = new User();
		user.setName("홍길동");
		user.setAge(100);
		
		return user;
	}
}
