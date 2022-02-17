package com.tqpp.Dao;

import java.util.List;

import com.tqpp.Model.Student;



public interface StudentDao {
	
	boolean addStudent(Student s);
	boolean deleteStudentby_id(int sid);
	boolean updateStudent(Student s);
	List<Student> getAllStudents();
	Student getStudentById(int sid);

}
