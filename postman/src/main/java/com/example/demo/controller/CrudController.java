package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Student;

@RestController
@RequestMapping("/crud")
public class CrudController {
	
	@PostMapping("/create")
	public String create(@RequestBody Student s) {
		System.out.println(s);
		return "create method";
	}
	
	@GetMapping("/read/{kodid}")
	public Student read(@PathVariable String kodid) {
		Student st1=new Student("KOD101","priyal","feb");
		Student st2=new Student("KOD102","ayushi","june");
		if (kodid.equals("KOD101"))
			return st1;
		else if (kodid.equals("KOD102"))
			return st2;
		return null;
		
	}
	
	@PutMapping("/update")
	public String update() {
		return "update method";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete method";
	}
	

}
