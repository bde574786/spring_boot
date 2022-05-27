package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// URL : 자원을 요청하는 주소 체계 방식
// URI : 식별자
// 스프링은 URI 방식 사용

@RestController
@RequestMapping("/api/get")
public class ApiController {

	// http://localhost:9090/api/hello
	// http://localhost:9090/api/get/hello
	@GetMapping("/hello")
	public String getHello() {
		return "sayhello";
	}

	// path-variable 방식
	// get --> URI 방식 사용 (데이터를 담아서 요청) // 처리를 하고 // 응답가능
	// http://localhost:9090/api/get/path-variable/[xxx]
//	@GetMapping(path = "/path-variable/{name}")
//	public String queryParam(@PathVariable(name = "name") String name) {
//		
//		System.out.println("브라우저에서 들어온 값을 받음 : " + name);
//		return "[[" + name +"]]";
//		
//	}
	
	
	//http://localhost:9090/api/get/path-variable/[xxx]/[xxx]
//	@GetMapping(path = "/path-variable/{name}/{age}")
//	public String queryParam2(@PathVariable(name = "name") String name,
//			@PathVariable(name = "age") int age) {
//		
//		System.out.println("name : " + name);
//		System.out.println("age : " + age);
//		return "name : " + name + " , " + "age : " + age;
//	}
	

	// 문제 1 새로운 주소 만들어서 요청 응답 (인자값 하나)
	@GetMapping(path = "/path-variable/{number}")
	public String queryParam3(@PathVariable(name = "number") int number) {
		return "number : " + number;
	}
	
	
	
	
	
	// 문제 2 새로운 주소 만들어서 요청 응답 (인자값 두개)
	@GetMapping(path = "/path-variable/{number}/{name}")
	public String queryParam4(@PathVariable(name = "number") int number,
			@PathVariable(name = "name") String name) {
		return "number : " + number + " , " +"name : " + name;
	}
	
}
