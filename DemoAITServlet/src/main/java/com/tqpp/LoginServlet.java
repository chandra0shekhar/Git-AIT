package com.tqpp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("yourname");
		String password=request.getParameter("pass");
		
		ArrayList<String> al=new ArrayList<>();
		al.add("singing");
		al.add("gardening");
		al.add("playing");
		request.setAttribute("hobbies", al);
		
		if(user.equals("chandu") && password.equals("1234"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("two");
			rd.forward(request, response);
			
		}
		else
		{
			PrintWriter pw=response.getWriter();
			pw.print("invalid user................");
			response.setContentType("text/html");
			pw.print("please re-enter the correct data");
			RequestDispatcher rdp=request.getRequestDispatcher("index.html");
			rdp.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
