package com.student.studentdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentdemo.model.Student;
import com.student.studentdemo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Object> saveStudent() {
		
		return new ResponseEntity<Object>("student service called ", HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Object> saveStudent(@RequestBody Student student) {
		
		return new ResponseEntity<Object>(studentService.save(student), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
	public ResponseEntity<Object> getAllStudents() {
		
		
		return new ResponseEntity<Object>(studentService.getAllStudents(), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Object> updateStudent(@RequestBody Student student) {
		
		
		return new ResponseEntity<Object>(studentService.update(student), HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteStudent(@PathVariable("id") String id ) {
		
		
		return new ResponseEntity<Object>(studentService.delete(id), HttpStatus.OK);
		
	}

}
