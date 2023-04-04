package com.swings;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame{
	private JCheckBox checkbox;
	public CheckBoxDemo(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setLayout(new FlowLayout());
		checkbox=new JCheckBox("Male");
		
		add(checkbox);
		
		checkbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(e.getActionCommand());
//				System.out.println(e.getSource());
				
			}
		});
		
		checkbox.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(e.getKeyChar());
			}
			
		});
		checkbox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getStateChange());
			}
			
		});
		
		checkbox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(e.getX());
				//System.out.println(e.getY());
			}
		});
		checkbox.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("hello");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemo gui=new CheckBoxDemo("CheckBox");
		gui.setVisible(true);

	}

}
