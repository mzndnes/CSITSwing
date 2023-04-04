package com.swings;
import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo2 extends JFrame{
	
	GridLayoutDemo2(String title){
		super(title);
		setLayout(new GridLayout(6,8,5,5));
		for (int row=1; row<=6; row++)
			for (int col=1; col<=8; col++) {
				 JButton b = new JButton();
				 if (Math.random() < 0.5)
					 b.setBackground(Color.black);
				 else
					 b.setBackground(Color.white);
				 add(b);
			}

		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(250, 200);
		 setVisible(true);
	}
	public static void main(String[] args) {
		GridLayoutDemo2 gui=new GridLayoutDemo2("Grid Layout");

	}

}




