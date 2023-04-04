package com.swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdapterClassDemo extends JFrame{
	private JTextField text;
	public AdapterClassDemo(String title) {
		super(title);
		setLayout(null);
		
		text=new JTextField();
		text.setBounds(20,20,120,25);
		add(text);
		
		text.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
		text.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				System.out.println("hello");
			}
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(290, 230); // manually computed sizes
		setResizable(false);
	}
	public static void main(String[] args) {
		AdapterClassDemo gui=new AdapterClassDemo("All Component");
		gui.setVisible(true);

	}

}
