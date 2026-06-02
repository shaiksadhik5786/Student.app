package com.web.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.springboot.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
