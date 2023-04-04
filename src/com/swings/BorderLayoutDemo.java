package com.swings;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	private JButton btnNorth, btnSouth, btnCenter, btnEast, btnWest;
	
	public BorderLayoutDemo() {
		super("Border Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new BorderLayout(3, 3));
		btnNorth = new JButton("North"); add(btnNorth, BorderLayout.NORTH);
		btnSouth = new JButton("South"); add(btnSouth, BorderLayout.SOUTH);
		btnCenter = new JButton("Center"); add(btnCenter, BorderLayout.CENTER);
		btnEast = new JButton("East"); add(btnEast, BorderLayout.EAST);
		btnWest = new JButton("West"); add(btnWest, BorderLayout.WEST);
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderLayoutDemo gui=new BorderLayoutDemo();
	}
}
