package com.ait;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ait.Model.Student;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String m1()
	{
		return "two";
		
	}
	
	@PostMapping("/think")
	public ModelAndView m2(@RequestParam("fname") String nm,@RequestParam("percent") int p,@RequestParam("city") String c)
	{
		Student s1=new Student(1,nm,p,c);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("two");
		mv.addObject("sobj",s1);
		return mv;
		
	}
	
	@ResponseBody
	@PostMapping("/hi")
	public String m3()
	{
		return "Good Evening";
	}
	
	
	
	@PostMapping("/hello")
	public ModelAndView m4(@RequestParam Map<String,String> map)
	{
		Student s1=new Student(1,map.get("sname"),Integer.parseInt(map.get("percent")),map.get("city"));
		ModelAndView mv=new ModelAndView("two");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		mv.addObject("studentlist", al);
		return mv;
	}
	
	
	
	@PostMapping("/add")
	public ModelAndView  m5(@ModelAttribute("stud") Student s1)
	{
		ModelAndView mv=new ModelAndView("two");
		mv.addObject("stud",s1);
		return mv;
	}


}
