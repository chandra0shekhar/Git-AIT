package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/two")
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print("in second servlet");
		
		/*ServletContext ctx=getServletContext();
		String s3=ctx.getInitParameter("url");
		pw.print("<h4>context data is "+s3+"</h4>");*/
		
		pw.print("successful login user "+request.getParameter("yourname"));
		ArrayList<String> lst= (ArrayList<String>) request.getAttribute("hobbies");
		pw.print(lst);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
