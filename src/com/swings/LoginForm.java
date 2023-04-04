package com.swings;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener{
	JLabel label1,label2, label3;
	JButton button;
	JTextField user;
	JPasswordField password;
	public LoginForm() {
		super("Login Form");
		setLayout(null);
		
		label1=new JLabel("Username");
		label1.setBounds(10,50,100,20);
		add(label1);
		
		label2=new JLabel("Password");
		label2.setBounds(10,100,100,20);
		add(label2);
		
		user=new JTextField();
		user.setBounds(120,50,120,20);
		add(user);
		
		password=new JPasswordField();
		password.setBounds(120,100,120,20);
		add(password);
		
		button=new JButton("Login");
		button.setBounds(100,150,120,25);		
		add(button);
		
		label3=new JLabel();
		label3.setBounds(20,20,300,20);
		add(label3);
		
		button.addActionListener(this);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,400,400); // manually computed sizes
		setResizable(false);
	}

	public static void main(String[] args) {
		LoginForm gui=new LoginForm();
		gui.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(user.getText().equalsIgnoreCase("admin") && password.getText().equalsIgnoreCase("admin") )
			label3.setText("Login Successful");
		else
			label3.setText("Wrong pasword or user name");
		if(user.getText().equals(""))
			JOptionPane.showMessageDialog(null,"empty");
	}
}
