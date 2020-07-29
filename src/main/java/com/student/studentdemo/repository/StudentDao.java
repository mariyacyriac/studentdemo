package com.student.studentdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.studentdemo.model.Student;

public interface StudentDao extends MongoRepository<Student, String>
{
	
}
