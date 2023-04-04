package com.swings;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextFieldDemo extends JFrame{
	JTextField text1;
	public TextFieldDemo(String title){
		super(title);
		setLayout(null);
		text1=new JTextField();
		text1.setBounds(20,20,120,30);
		add(text1);
		//text1.setText("Hello");
		Font font=new Font("Arial",Font.BOLD,25);
		text1.setFont(font);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,50,400, 400); // manually computed sizes
		setResizable(false);
		
//		text1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("hi");
//			}
//			
//		});
		
		text1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getX());
				System.out.println(e.getY());
			}

		});
		text1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				char ch=e.getKeyChar();
				if(!Character.isDigit(ch))
					e.consume();
				if(text1.getText().equals(""))
					System.out.println("empty");
			}

			//@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				char ch=e.getKeyChar();
				if(!Character.isDigit(ch))
					e.consume();
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	}
	public static void main(String[] args) {
		TextFieldDemo obj=new TextFieldDemo("TextField");
		obj.setVisible(true);

	}

}
