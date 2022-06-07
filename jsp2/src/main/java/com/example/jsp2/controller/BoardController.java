package com.example.jsp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/index")
	public String index() {	
		
//		prefix: /WEB-INF/views/
//	    suffix: .jsp
//		/WEB-INF/views/index.jsp
		
		return "index";
	}
	
	
	@GetMapping("/example1")
	public String example1() {
		return "example1";
	}
	
	@GetMapping("/example2")
	public String example2() {
		return "example2";
	}
	
	@GetMapping("/if")
	public String if2() {
		return "if";
	}

	@GetMapping("/while")
	public String while2() {
		return "while";
	}
	
	@GetMapping("/for")
	public String for2() {
		return "for";
	}
	
	@GetMapping("/round")
	public String round() {
		return "round";
	}
	
}
