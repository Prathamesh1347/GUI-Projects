package p1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginS extends JFrame {
	// 1.
//	LoginS(String s1){
//		super(s1);
//		
//	}
//	LoginS(){}
//	
//	void setComponenets() {
//		JLabel j1 = new JLabel("Welcome!");
//		JTextField t1 = new JTextField();
//		setLayout(null);
//		t1.setBounds(200,200,100,30);
//		j1.setBounds(200,200,100,50);
//		add(t1);
//		add(j1);
//	}
//	
//	public static void main(String[] args) {
//		
//		LoginS s1 = new LoginS("Welcome to Our Platform! ");
//		s1.setVisible(true);
//		s1.setSize(700, 700);
//		s1.setComponenets();
//		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}

	// 2.
	JLabel j1, j2, j3, j4;
	JTextField t1, t2, t3;
	JButton b1, b2, b3;

	LoginS(String s1) {
		super(s1);

	}

	LoginS() {
	}

	void setComponenets() {
		j1 = new JLabel("Welcome to CoDing Seekho Institute! ");
		j2 = new JLabel("Username");
		j3 = new JLabel("Password");
		j4 = new JLabel();

		t1 = new JTextField();
		t2 = new JTextField();

		b1 = new JButton("Login");
		b2 = new JButton("Clear");
		b3 = new JButton("ADD");

		setLayout(null);

		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(t1);
		add(t2);
//		add(t3);
		add(b1);
		add(b2);
		add(b3);

		j1.setBounds(100, 50, 500, 100);
		j2.setBounds(100, 200, 100, 30);
		j3.setBounds(100, 350, 100, 30);
		j4.setBounds(100, 550, 100, 30);
		t1.setBounds(350, 200, 100, 30);
		t2.setBounds(350, 350, 100, 30);
//		t3.setBounds(200,500,100,30);
		b1.setBounds(200, 450, 100, 30);
		b2.setBounds(400, 450, 100, 30);
		b3.setBounds(500,500,100,30);
		b1.addActionListener(new Log());
		b2.addActionListener(new Clear());
		b3.addActionListener(new Add());
	}

	public static void main(String[] args) {
		LoginS s1 = new LoginS("Welcome to Our Platform! ");
		s1.setVisible(true);
		s1.setSize(700, 700);
		s1.setComponenets();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class Log implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e1) {
			String s1 = t1.getText();
			String s2 = t2.getText();

			if (s1.equals("Coding") && s2.equals("Seekho")) {
				j4.setText("Login Successful!");
			} else {
				j4.setText("Login Failed :( ");
			}

		}
	}

	class Clear implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e2) {
				t1.setText("");
				t2.setText("");
		}
	}
	class Add implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e2) {
				try {
					int a = Integer.parseInt(t1.getText());
					int b = Integer.parseInt(t2.getText());
					int c = a+b;
					j4.setText("Addition :"+c);
				}catch(Exception e){
					j4.setText("Pls type Only number! ");
				}
		}
	}
}
