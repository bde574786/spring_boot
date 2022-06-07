package com.example.filter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {

	//.../board/list
	@GetMapping("/list")
	public List<String> list() {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		
		return list;
	}
}
