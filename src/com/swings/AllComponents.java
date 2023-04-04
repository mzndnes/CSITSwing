package com.swings;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AllComponents extends JFrame{
	private JTextField text;
	private JButton button;
	private JCheckBox checkbox1,checkbox2;
	private JRadioButton radio1,radio2;
	private JLabel label;
	private JComboBox combo;
	private JList<String> list;
	
	public AllComponents(String title) {
		super(title);
		setLayout(new FlowLayout());
		
//		String []course= {"OOP","DataBase","Discrete"};
//		combo=new JComboBox(course);
		String [] days= {"sun","mon","tue","wed","thu","Fri","sat"};
		list=new JList<String>(days);
		text=new JTextField("hi who are you");
//		text.setBounds(10,10,120,25);
		
//		list.setBounds(10,40,120,120);
		button=new JButton("Click Me");
//		button.setBounds(10,165,100,25);
		checkbox1=new JCheckBox("Dancing");
		checkbox2=new JCheckBox("Singing");
//		checkbox2.setBounds(140,10,50,25);
		radio1=new JRadioButton("Male");
//		radio1.setBounds(140,40,100,25);
		radio2=new JRadioButton("Female");
//		radio2.setBounds(140,80,100,25);
//		label=new JLabel("hi");
		
		add(list);
		add(text);
		add(button);
		add(checkbox1);
		add(checkbox2);
		add(radio1);
		add(radio2);
//		add(label);
//		add(combo);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600); // manually computed sizes
//		setResizable(false);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllComponents gui=new AllComponents("All Component");
		gui.setVisible(true);
	}


}




