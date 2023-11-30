package com.sample.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentsDao {
	private String queryInsert = "insert into students(npm,firstname,middlename,lastname,"
			+ "email,birthdate)"+"values(?,?,?,?,?,?)";
	
	public void saved(Students students) throws Exception  {
		Connection c = new ConnectionDB().connect();
		
		PreparedStatement psInsert = c.prepareStatement(queryInsert);
		
		psInsert.setString(1, students.getNpm());
		psInsert.setString(2, students.getFirstname());
		psInsert.setString(3, students.getMiddlename());
		psInsert.setString(4, students.getLastname());
		psInsert.setString(5, students.getEmail());
		psInsert.setString(6, students.getBirthdate());
		
		psInsert.executeUpdate();
		
		c.close();
	}
}