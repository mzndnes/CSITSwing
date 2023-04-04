package com.swings;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MenuDemo extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu file,edit,open;
	private JMenuItem newdoc,word,excel,redo,undo;
	
	public MenuDemo(String title) {
		super(title);
		setLayout(null);
		
		menuBar=new JMenuBar();
		file=new JMenu("File");
		edit=new JMenu("Edit");
		open=new JMenu("Open");
		newdoc=new JMenuItem("New");
		word=new JMenuItem("Word");
		excel=new JMenuItem("Excel");
		redo=new JMenuItem("Redo");
		undo=new JMenuItem("Undo");
		
		file.add(newdoc);
		open.add(word);
		open.add(excel);
		file.add(open);
		edit.add(redo);
		edit.add(undo);
		
		menuBar.add(file);
		menuBar.add(edit);
		
		
		setJMenuBar(menuBar);
		word.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
			
		});
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(290, 230); // manually computed sizes
		setResizable(false);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuDemo gui=new MenuDemo("All Component");
		gui.setVisible(true);
	}


}




