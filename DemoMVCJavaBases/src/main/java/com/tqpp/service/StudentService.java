package com.tqpp.service;

import java.util.List;

import com.tqpp.Model.Student;

public interface StudentService {
	

	boolean addStudent(Student s);
	boolean deleteStudent(Student ob);
	boolean updateStudent(Student s);
	List<Student> getAllStudents();
	Student getStudentById(int sid);

}
