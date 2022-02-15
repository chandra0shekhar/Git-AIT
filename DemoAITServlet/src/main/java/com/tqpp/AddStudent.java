package com.tqpp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addstud")
public class AddStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nm=req.getParameter("sname");
		int percent=Integer.parseInt(req.getParameter("persent"));
		String city=req.getParameter("city");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/birla","root","chandu8915"))
		{
			PreparedStatement pst=con.prepareStatement("insert into student2(sname,persent,city) values(?,?,?)");
			pst.setString(1, nm);
			pst.setInt(2, percent);
			pst.setString(3, city);
			pst.executeUpdate();
			
			req.setAttribute("status","successfully record added");
			
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);

	}

}
