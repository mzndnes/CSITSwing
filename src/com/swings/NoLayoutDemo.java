package com.swings;


import javax.swing.*;
public class NoLayoutDemo extends JFrame {
	public NoLayoutDemo(String name) {
		super(name);
		// Choose to lay out components manually
		setLayout(null);
		//The text field
		JTextField newItemField = new JTextField();
		newItemField.setLocation(10,10);
		newItemField.setSize(150,25);
		add(newItemField);
		//The Add button
		 JButton addButton = new JButton("Add");
		 addButton.setMnemonic('A');
		 addButton.setLocation(175, 10);
		 addButton.setSize(100,25);
		 add(addButton);
		 //The List
		 String[] stuff = {"Apples", "Oranges", "Grapes","Pineapples", "Cherries"};
		 JList itemsList = new JList(stuff);
		 JScrollPane scrollPane = new JScrollPane(itemsList,
		 ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
		 ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane.setLocation(10,45);
		 scrollPane.setSize(150,150);
		 add(scrollPane);
		 //The Remove button
		 JButton removeButton = new JButton("Remove");
		 removeButton.setMnemonic('R');
		 removeButton.setLocation(175,45);
		 removeButton.setSize(100,25);
		 add(removeButton);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setSize(290, 230); // manually computed sizes
		 setResizable(false); 
	}
	public static void main(String[] args) {
		 try {

		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName
		());
		 } catch(Exception e) {}
		 JFrame.setDefaultLookAndFeelDecorated(true);
		 JFrame frame = new NoLayoutDemo("Without a Layout Manager");
		 frame.setVisible(true);
	}
 }