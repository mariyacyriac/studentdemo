package com.student.studentdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document
public class Student {
	
	@Id
	private String id;
	private String name;
	private double totalMarks;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, double totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.totalMarks = totalMarks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", totalMarks=" + totalMarks + "]";
	}
	
	


}
