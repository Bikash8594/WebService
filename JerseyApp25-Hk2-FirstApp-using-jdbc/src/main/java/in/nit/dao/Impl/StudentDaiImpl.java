package in.nit.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.nit.conn.DbContext;
import in.nit.dao.IStudentDao;
import in.nit.model.Student;

public class StudentDaiImpl implements IStudentDao {
	public int saveStudent(Student s) { 
		int i=0;  
		try { 
			String SQL="INSERT INTO STUDENT2 VALUES(?,?,?,?,?)"; 
			Connection con=DbContext.getCon();   
			PreparedStatement pstmt=con.prepareStatement(SQL);      
			pstmt.setInt(1, s.getSid()); 
			pstmt.setString(2, s.getSname()); 
			pstmt.setDouble(3, s.getSfee());  
			pstmt.setString(4, s.getCourse()); 
			pstmt.setDouble(5, s.getDiscount());     
			i=pstmt.executeUpdate();   
		} catch (SQLException e) { 
			e.printStackTrace();   } 

		return i;  
	}



}
