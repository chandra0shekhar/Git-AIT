package com.tqpp;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First_Servlet extends HttpServlet {
	
	public First_Servlet() {
		System.out.println("in default constructor");
	}
	
	public void  doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		
		
		String s1=req.getParameter("yourname");
		String s2=req.getParameter("pass");
		
		PrintWriter pw=resp.getWriter();
		ServletContext ctx=getServletContext();
		ServletConfig cfg=getServletConfig();
		String s3=ctx.getInitParameter("url");
		String s4=cfg.getInitParameter("username");
		pw.print("<html>");
		pw.print("<body><h1> welcome user "+s1+"</h1>");
		pw.print("<h4>context data is "+s3+"</h4>");
		pw.print("<h4>config data is "+s4+"</h4>");
		pw.print("<h4> your password id is "+s2+"</h4>");
		pw.print("</body></html>");
			
	
		/*String s1=req.getParameter("name");
		String s2=req.getParameter("crushname");
		
		PrintWriter pw=resp.getWriter();
		pw.print("<html>");
		pw.print("<body><h1> "+s1+" loves "+s2+"</h1>");
		pw.print("</body></html>");*/
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp)
	
	{
		
	}

}
