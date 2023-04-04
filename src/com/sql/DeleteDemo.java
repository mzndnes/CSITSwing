package com.sql;

import java.sql.*;
public class DeleteDemo {
	static String url="jdbc:mysql://localhost:3306/BCAData";
	static String uname="admin";
	static String pass="admin";

	public static void main(String[] args) {
		Connection con;
		Statement st;
		String query="delete from student where sid=6";
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
			st = con.createStatement();
			st.executeUpdate(query);
			st.close();
			con.close();
		} catch (ClassNotFoundException e) { } 
		catch (SQLException e) { }			
	}
}
