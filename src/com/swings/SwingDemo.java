package com.swings;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SwingDemo extends JFrame{
	private JLabel label1;
	private JLabel label2;
	
	public SwingDemo() {
		super("First Swing Application");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		label1=new JLabel("Hello");
		label2=new JLabel("World");
		label1.setFont(new Font("Sans Serif",Font.PLAIN,30));
		label2.setFont(new Font("Sans Serif",Font.PLAIN,30));
		add(label1);
		add(label2);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingDemo gui=new SwingDemo();
		String str1 = JOptionPane.showInputDialog("Enter 1st integer");
		String str2 = JOptionPane.showInputDialog("Enter 2nd integer");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum);

	}

}
