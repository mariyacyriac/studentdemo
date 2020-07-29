package com.student.studentdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentdemo.model.Student;
import com.student.studentdemo.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao  studentdao;

	@Override
	public List<Student> getAllStudents() {
		return studentdao.findAll();
	}

	@Override
	public Student update(Student student) {
		Student obj = null;
		Optional<Student> exists = studentdao.findById(student.getId());
		if (exists.isPresent()) {
			obj = exists.get();
			obj.setName(student.getName());
			obj.setTotalMarks(student.getTotalMarks());
			obj = studentdao.save(obj);
			return obj;
			
		}
		return obj;
	}

	@Override
	public Student save(Student student) {
		return studentdao.save(student);
		
	}

	@Override
	public boolean delete(String id) {
		studentdao.deleteById(id);
		return true;
	}

}
