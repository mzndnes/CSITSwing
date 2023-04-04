package com.swings;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	private JButton btn1, btn2, btn3, btn4, btn5, btn6;
	public GridLayoutDemo() {
		super("Grid Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		setLayout(new GridLayout(3, 2));
		btn1 = new JButton("Button 1"); add(btn1);
		btn2 = new JButton("This is Button 2"); add(btn2);
		btn3 = new JButton("3"); add(btn3);
		btn4 = new JButton("Another Button 4"); add(btn4);
		btn5 = new JButton("Button 5"); add(btn5);
		btn6 = new JButton("One More Button 6"); add(btn6);
		setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutDemo gui=new GridLayoutDemo();
	}
}
