package com.swings;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FlowLayoutDemo extends JFrame{
	private JButton btn1,btn2,btn3,btn4,btn5,btn6;
	private JLabel label2;
	
	public FlowLayoutDemo() {
		super("First Swing Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		btn1 = new JButton("Button 1"); add(btn1);
		btn2 = new JButton("This is Button 2"); add(btn2);
		btn3 = new JButton("3"); add(btn3);
		btn4 = new JButton("Another Button 4"); add(btn4);
		btn5 = new JButton("Button 5"); add(btn5);
		btn6 = new JButton("One More Button 6"); add(btn6);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		FlowLayoutDemo gui=new FlowLayoutDemo();
	}
}
