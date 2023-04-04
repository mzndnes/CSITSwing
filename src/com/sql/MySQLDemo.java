package com.sql;

import java.sql.*;
public class MySQLDemo {
	static String url="jdbc:mysql://localhost:3306/BCAData";
	static String uname="admin";
	static String pass="admin";

	public static void main(String[] args) {
		Connection con;
		Statement st;
		String query="select * from student";
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,pass);
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				int sid=rs.getInt("sid");
				String name=rs.getString("sname");
				String dob=rs.getString("dob");
				String gender=rs.getString("gender");
				System.out.println(sid + "      "+name+"      "+dob+"    "+gender);
			}
			st.close();
			con.close();
		} catch (ClassNotFoundException e) { } 
		catch (SQLException e) { }			
	}
}
