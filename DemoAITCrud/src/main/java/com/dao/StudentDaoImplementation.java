package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Configuration.DBConnect;
import com.model.Student;

public class StudentDaoImplementation implements StudentDao {
	public static final String STUDENT_INSERT_SQL="insert into student2 (sname,persent,birthdate,city) values(?,?,?,?)";
	public static final String STUDENT_DATA_SQL="select * from student2";
	public static final String FETCH_STUDENT_SQL="select * from student2 where sid=?";
	public static final String DELETE_STUDENT_SQL="delete from student2 where sid=?";
	private static final String UPDATE_STUDENT_SQL="update student2 set percent=?,city=? where sid=?";
	

	

	@Override
	public boolean addStudent(Student s) {
		
		try {
			Connection con=DBConnect.getConnection();PreparedStatement pst=con.prepareStatement(STUDENT_INSERT_SQL);
			
			pst.setString(1,s.getSname());
			pst.setInt(2, s.getPersent());
			pst.setDate(3, s.getBirthdate());
			pst.setString(4, s.getCity());
			pst.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteStudentby_id(int sid) {
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement(DELETE_STUDENT_SQL)) {
				pst.setInt(1, sid);
				pst.executeUpdate();
				return true;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;

	}

	@Override
	public boolean updateStudent(Student s) {

        try(Connection con=DBConnect.getConnection();PreparedStatement pst=con.prepareStatement(UPDATE_STUDENT_SQL))
        {
        	pst.setInt(1, s.getPersent());
        	pst.setString(2, s.getCity());
        	pst.setInt(3, s.getSid());
        	pst.executeUpdate();
        	return true;
        	
        	
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public List<Student> getAllStudents() {
		try(Connection con=DBConnect.getConnection();Statement st=con.createStatement())
		{
			ResultSet rs=st.executeQuery(STUDENT_DATA_SQL);
			ArrayList<Student > slist=new ArrayList<Student>();
			while(rs.next())
			{
				Student s1=new Student();
				s1.setSid(rs.getInt("sid"));
				s1.setSname(rs.getString("sname"));
				s1.setPersent(rs.getInt(3));
				s1.setBirthdate(rs.getDate(4));
				s1.setCity(rs.getString(5));
				slist.add(s1);
			}
			return slist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student getStudentById(int sid) {
		try (Connection con=DBConnect.getConnection();PreparedStatement pst=con.prepareStatement(FETCH_STUDENT_SQL))
					{
				
					pst.setInt(1, sid);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next())
					{
						Student s1=new Student();
						s1.setSid(rs.getInt(1));
						s1.setSname(rs.getString(2));
						s1.setPersent(rs.getInt(3));
						s1.setBirthdate(rs.getDate(4));
						s1.setCity(rs.getString(5));
						return s1;
					}
					else
						return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
