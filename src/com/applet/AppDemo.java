package com.applet;

import java.applet.*;
import java.awt.*;


/*
<applet  code="com.applet.AppDemo.class" width=300 height=300></applet>
*/
public class AppDemo extends Applet{
	
	public void init() {
//		setLayout(null);
//		text=new JTextField("hello");
//		text.setBounds(20,20,120,20);
//		add(text);
		//setVisible(true);
		setBackground(Color.cyan);
	}
	public void paint(Graphics g) {
		g.drawString("hello", 50, 25);
	}
	
}
