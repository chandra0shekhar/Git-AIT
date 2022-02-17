package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PracticeServlet")
public class PracticeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		String s1=req.getParameter("name");
		String s2=req.getParameter("crushname");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<http>");
		pw.print("<body><h1> "+s1+" loves "+s2+"</h1>");
		pw.print("</body></html>");
		
	}
	
	

}
