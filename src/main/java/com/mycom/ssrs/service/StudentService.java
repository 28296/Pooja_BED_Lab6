package com.mycom.ssrs.service;

import java.util.List;

import com.mycom.ssrs.entity.Student;

public interface StudentService {

	public List<Student> findAll();
	public void save(Student student);
	public Student findById(int id);
	public void deleteById(int id);
}
