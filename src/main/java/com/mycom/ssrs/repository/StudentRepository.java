package com.mycom.ssrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycom.ssrs.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
