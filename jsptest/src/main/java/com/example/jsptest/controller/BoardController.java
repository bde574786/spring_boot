package com.example.jsptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		
		// /WEB-INF/views/home.jsp
		return "home";
	}
	
}
