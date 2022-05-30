package com.example.demo2.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.dto.UserRequest;

@RestController
@RequestMapping("api2")
public class PostApiController {

	/**
	 * 	{ 
	 * 		"name" : "value", 
	 * 		"age" : value 
	 * 	}
	 */

	// 1. MAP 방식 (@RequestBody)
	// http://localhost:9090/api2/post1 (POST)
	@PostMapping("/post1")
	public String post1(@RequestBody Map<String, Object> requestData) {
		System.out.println("post1 test1");
		StringBuffer sb = new StringBuffer();

		requestData.entrySet().forEach(entry -> {
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
			sb.append(entry.getKey() + "=" + entry.getValue());
		});

		return sb.toString();
	}

	// 2. dto 방식
	// java / mobile
	// 네트워크 통신 BR, BW --> 문자열 전송 (json parsing)
	// why 문자열이 자동으로 Object가 되는가
	// 메세지 컨버터가 자동으로 문자열을 파싱해서 --> UserRequest 매핑 처리
	@PostMapping("/post2")
	public String post2(@RequestBody UserRequest requestData) {
		System.out.println(requestData.toString() + "데이터가 잘 들어 옴 !!! ");
		return requestData.toString();
	}
	
	
	

}
