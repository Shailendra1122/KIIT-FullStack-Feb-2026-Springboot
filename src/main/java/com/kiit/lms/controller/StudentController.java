package com.kiit.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiit.lms.model.Student;
import com.kiit.lms.service.StudentService;

@RestController
@RequestMapping("/kiit/lms")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/test")
	public String test()
	{
		return "Welcomt to FSD";
	}
	
	@RequestMapping("/add-student")
	public String addStudent()
	{
		Student s1=Student.builder()
				.sname("Alice")
				.per(78.5)
				.build();
		
		studentService.addStudent(s1);
		return "Student Added Successfully";
	}
}
