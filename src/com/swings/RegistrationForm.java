package com.swings;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.text.DateFormatSymbols;
public class RegistrationForm extends JFrame implements ActionListener{
	JLabel nameLabel,mobileLabel, genderLabel, dobLabel;
	JLabel addressLabel,statusLabel;
	JButton submit;
	JTextField nameText, mobileText,addressText;
	JComboBox day,month,year;
	JTextArea details;
	JCheckBox terms;
	JRadioButton male, female;
	public RegistrationForm(String title) {
		super(title);
		setLayout(null);
		
		nameLabel=new JLabel("Full Name");
		nameLabel.setBounds(50,50,150,20);
		add(nameLabel);
		
		mobileLabel=new JLabel("Mobile No.");
		mobileLabel.setBounds(50,100,150,20);
		add(mobileLabel);
		
		genderLabel=new JLabel("Gender");
		genderLabel.setBounds(50,150,150,20);
		add(genderLabel);
		
		dobLabel=new JLabel("Date of Birth");
		dobLabel.setBounds(50,200,150,20);
		add(dobLabel);
		
		addressLabel=new JLabel("Address");
		addressLabel.setBounds(50,250,150,20);
		add(addressLabel);
		
		terms=new JCheckBox("Accept the terms and condition");
		terms.setBounds(100,300,400,20);
		add(terms);
		
		submit=new JButton("Submit");
		submit.setBounds(100,350,100,25);		
		add(submit);
		
		statusLabel=new JLabel();
		statusLabel.setBounds(100,400,400,20);
		add(statusLabel);
		
		nameText=new JTextField();
		nameText.setBounds(250,50,250,20);
		add(nameText);
		
		mobileText=new JTextField();
		mobileText.setBounds(250,100,250,20);
		add(mobileText);
		
		male=new JRadioButton("Male");
		male.setBounds(250,150,100,20);
		add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(350,150,100,20);
		add(female);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		List<String> dayList=new ArrayList<>();
		for(int i=1;i<=32;i++)
			dayList.add(String.valueOf(i));
		
		Object[]days = dayList.toArray();
		day=new JComboBox(days);
		day.setBounds(250,200,50,20);
		add(day);
		
		String []monthNames=new DateFormatSymbols().getShortMonths();
		month=new JComboBox(monthNames);
		month.setBounds(320,200,50,20);
		add(month);
		
		List<String> yearList=new ArrayList<>();
		for(int i=2000;i<=2022;i++)
			yearList.add(String.valueOf(i));
		
		Object[]years = yearList.toArray();
		year=new JComboBox(years);
		year.setBounds(400,200,100,20);
		add(year);
		
		addressText=new JTextField();
		addressText.setBounds(250,250,250,20);
		add(addressText);
		
		details=new JTextArea();
		details.setBounds(500,300,270,350);
		add(details);
		submit.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,800,800); // manually computed sizes
		setResizable(false);
	}

	public static void main(String[] args) {
		RegistrationForm gui=new RegistrationForm("Registration Form");
		gui.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(terms.isSelected()) {
			statusLabel.setText("Registration Successful");
			String name=nameText.getText();
			String mobile=mobileText.getText();
			String gender="Male";
			if (female.isSelected())
				gender="Female";
			String dob=year.getSelectedItem()+"-"+month.getSelectedItem()+"-"+day.getSelectedItem();
			details.setText("Name: "+name+"\n"+
			"Mobile: "+mobile+"\n"+
			"Gender: "+gender+"\n"+
			"Date of Birth: "+dob);
		}
		else {
			statusLabel.setText("Complete all the inputs");
			details.setText("");
		}
	}
}
