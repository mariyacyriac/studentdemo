package com.student.studentdemo.service;

import java.util.List;


import com.student.studentdemo.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student update(Student student);
	public Student save(Student student);
	public boolean delete(String id);
	
	

}
