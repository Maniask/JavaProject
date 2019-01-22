package javaproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame   {
	JLabel l1,l2,l3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	MyFrame(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(4,2,20,30));	
		l1=new JLabel("Number 1");
		l2=new JLabel("Number 2");
		l3=new JLabel("Result");
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		b1=new JButton("Sum");
		b2=new JButton("Average");
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(l3);add(tf3);
		add(b1);add(b2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x=Integer.parseInt(tf1.getText());
				int y=Integer.parseInt(tf2.getText());
				tf3.setText(x+y+" ");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int x=Integer.parseInt(tf1.getText());
				int y=Integer.parseInt(tf2.getText());
				tf3.setText((x+y)/2.0f+" ");
				
			}
		});
		setSize(400,300);
		setVisible(true);
		
				
	}
	

	public static void main(String[] args) {
		new MyFrame();

	}
}
