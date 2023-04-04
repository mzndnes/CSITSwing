package com.swings;

import java.awt.*;


import javax.swing.*;


public class TableDemo extends JFrame{
	private JTable table;
	private JScrollPane pane1;
	public TableDemo (String title) {
		super(title);
		String [][] data= {
				{"Dan","2011","Machine Learning"},
				{ "Patrick","2022","Database"}
				};
		String []columns= {"Name","Symbol","Course"};
		table=new JTable(data,columns);  
		pane1=new JScrollPane(table);
		add(pane1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,800); 
		
		
	}

	public static void main(String[] args) {
		TableDemo gui=new TableDemo("Table with Swing");
		gui.setVisible(true);
	}

}
