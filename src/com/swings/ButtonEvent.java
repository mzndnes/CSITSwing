package com.swings;


import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class ButtonEvent extends JFrame implements ActionListener{
	JButton button1;
	JButton button2;
	public ButtonEvent(String title) {
		super(title);
		setLayout(null);
		
		button1=new JButton("Red");
		button1.setBounds(20,20,120,25);
		
		button2=new JButton("Blue");
		button2.setBounds(150,20,120,25);
		
		add(button1);
		add(button2);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10,10,400,400); // manually computed sizes
		setResizable(false);
	}

	public static void main(String[] args) {
		ButtonEvent gui=new ButtonEvent("EventDemo");
		gui.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1)
			getContentPane().setBackground(Color.RED);
		else
			getContentPane().setBackground(Color.BLUE);
	}

}
