package com.sql;

import java.sql.*;
import java.util.Scanner;
public class InsertDemo {
	static String url="jdbc:mysql://localhost:3306/BCAData";
	static String uname="admin";
	static String pass="admin";
	
	public static void insertIntoDB(int roll,String name, String dob, String gender)throws ClassNotFoundException, SQLException {
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

	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		int ch=1;
		int roll;
		String name,dob,gender;
		System.out.println("Enter roll name dob and gender");
		while(ch==1) {
			roll=sc.nextInt();
			name=sc.next();
			dob=sc.next();
			gender=sc.next();
			try {
			insertIntoDB(roll,name,dob,gender);
			}catch(Exception e) {}
			System.out.println("Enter 1 to insert more otherwise 0");
			ch=sc.nextInt();
		}
		
		
	}
}
