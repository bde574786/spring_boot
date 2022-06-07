package com.example.jsptest.controller;

import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.example.jsptest.dto.User;

@RestController
@RequestMapping("/api")
//@Controller // html 문서 리턴
public class ApiController {

	@GetMapping("/user")
	public User get(@RequestParam String name, @RequestParam Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);

		return user;
	}
	
	
	
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}
	
	
	// 특정 예외를 해당 컨트롤러에서 처리하고 싶다면
	// GlobalAdvice보다 먼저 동작
//	@ExceptionHandler(value = MethodArgumentNotValidException.class)
//	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e){
//		System.out.println("여기는 API 컨트롤러 입니다. !!!");
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//	}
	
	
	
}
