package com.web.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.springboot.entities.Student;
import com.web.springboot.service.StudentService;

@RestController
@RequestMapping("/student")
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public String get()
	{
		return "Hi, your Spring boot app is in live";
	}
	
	@GetMapping("/all")
	public List<Student> getStudents()
	{
		List<Student> student = studentService.findAll();
		
		return student;
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") long id)
	{
		Student student = studentService.findById(id);
		return student;
	}
}
