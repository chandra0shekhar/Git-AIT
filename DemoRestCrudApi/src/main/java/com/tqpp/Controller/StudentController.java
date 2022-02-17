package com.tqpp.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tqpp.Model.Student;
import com.tqpp.service.StudentService;

@Controller
public class StudentController {
	
	/*@ResponseBody
	@GetMapping(value="/",produces = "application/json")
	public ArrayList<Student> getStudent()
	{
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1=new Student(1,"yash",76,"pune");
		al.add(s1);
		al.add(new Student(2,"dev",76,"mumbai"));
		al.add(new Student(3,"raj",76,"pune"));
		al.add(new Student(3,"ram",74,"nagpur"));
		return al;
	}
	@ResponseBody
	@GetMapping(value="/getall",produces="application/json")
	public HashMap<String,Student> m2()
	{
		HashMap<String,Student> hm=new HashMap<>();
		hm.put("dev", new Student(2,"dev",76,"mumbai"));
		hm.put("ram", new Student(3,"ram",74,"nagpur"));
		return hm;
	}*/
	@Autowired
	private StudentService studservice;
	
	@ResponseBody
	@GetMapping(value="/students",produces="application/json")
	public List<Student> getAllStudents()
	{
		return studservice.getAllStudents();
	}
	
	@ResponseBody
	@GetMapping(value="/students/{rollno}") 
	public Student getStudentById(@PathVariable("rollno") int id)
	{
		System.out.println(id);
		return studservice.getStudentById(id);
	}
	@ResponseBody
	@PostMapping(value="/students")
	public boolean addStudent(Student s)
	{
		studservice.insertStudent(s);
		return true;
	}

}
