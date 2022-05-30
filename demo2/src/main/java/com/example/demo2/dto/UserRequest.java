package com.example.demo2.dto;

// http://localhost:9090/api/get/query-param2?name=야스오&email=abc@naver.com&age=11&birth=19900801
public class UserRequest {

	private String name;
	private String email;
	private int age;
	private String birth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "UserRequest [name=" + name + ", email=" + email + ", age=" + age + ", birth=" + birth + "]";
	}

	
	
}
