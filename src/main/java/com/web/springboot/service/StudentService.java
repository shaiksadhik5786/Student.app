package com.web.springboot.service;

import java.util.List;

import com.web.springboot.entities.Student;

public interface StudentService {

	List<Student> findAll();
	Student findById(long id);
}
