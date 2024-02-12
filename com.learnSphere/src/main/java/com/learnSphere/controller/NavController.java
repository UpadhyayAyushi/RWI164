package com.learnSphere.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/addC")
	public String addC() {
		return "addCourse";
	}
	
	@GetMapping("/newLesson")
	public String newLesson() {
		return "newlesson";
	}
	
	@GetMapping("/studenthome")
	public String studenthome() {
		return "studenthome";
	}

}
