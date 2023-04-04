package com.applet;

import java.applet.Applet;
import java.awt.*;




public class AppletDemo extends Applet{
	
	public void init() {
//		setLayout(null);
//		text=new JTextField("hello");
//		text.setBounds(20,20,120,20);
//		add(text);
		//setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawString("hello", 50, 25);
	}
	
}
//<applet  code="AppletDemo.class" width=300 height=300></applet>