package com.swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonEvent2 extends JFrame implements ActionListener{
	private JButton button1;
	private JTextField text1;
	private JTextField text2;
	private JLabel label;
	public ButtonEvent2(String title) {
		super(title);
		setLayout(null);
		text1=new JTextField();
		text1.setBounds(20,20,120,25);
		add(text1);
		text2=new JTextField();
		text2.setBounds(20,45,120,25);
		add(text2);
		button1=new JButton("Add");
		button1.setBounds(20,70,120,25);
		add(button1);
		button1.addActionListener(this);
		label=new JLabel();
		label.setBounds(20,170,120,25);
		add(label);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10,10,400,400); // manually computed sizes
		setResizable(false);
		
	}

	public static void main(String[] args) {
		ButtonEvent2 gui=new ButtonEvent2("EventDemo");
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "Hello");
		int num1=Integer.parseInt(text1.getText());
		int num2=Integer.parseInt(text2.getText());
		
		int sum=num1+num2;
		label.setText("Result: "+String.valueOf(sum));
	}

}
