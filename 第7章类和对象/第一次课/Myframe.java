package com;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

public class Myframe extends JFrame {
	public Myframe() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("hello world");
				 Toolkit.getDefaultToolkit().beep();
			}
		});
		btnNewButton.setBounds(142, 190, 93, 23);
		getContentPane().add(btnNewButton);
	}
}
