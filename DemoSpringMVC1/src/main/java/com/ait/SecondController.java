package com.ait;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
	
	
		
		@GetMapping("/one")
		public String m1(HttpServletRequest request)
		{
			System.out.println("in one");
		    request.setAttribute("name","shekhar");
			return "forward:/two";
			
		}
		
		@GetMapping("/two")
		public String m2()
		{
			
			return "third";
			
		}
		

	}



