package com.sql;

import java.sql.*;
public class PreparedStatementDemo {
	static String url="jdbc:mysql://localhost:3306/BCAData";
	static String uname="admin";
	static String pass="admin";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int roll=6;
		String name="Jonna";
		String dob="2003-02-02";
		String gender="male";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		String query="insert into student values (?,?,?,?)";
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, roll);
		st.setString(2, name);
		st.setString(3, dob);
		st.setString(4, gender);
		st.executeUpdate();		
		st.close();
		con.close();	
	}
}
