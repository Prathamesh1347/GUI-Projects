package p1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.awt.*;

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

	/**
	 * 
	 */
	private static final long serialVersionUID = 7485207851923048562L;
	// 2.
	JLabel j1, j2, j3, j4, j5;
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4;

	LoginS(String s1) {
		super(s1);

	}

	LoginS() {
	}

	void setComponenets() {
		Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
		Cursor c2 = new Cursor(Cursor.WAIT_CURSOR);
		Cursor c3 = new Cursor(Cursor.CROSSHAIR_CURSOR);
		Cursor c4 = new Cursor(Cursor.E_RESIZE_CURSOR);
		
		
		Font f1 =new Font("Times New Roman",Font.BOLD,28);
//		Font f2 =new Font("Times New Roman",Font.ITALIC,18);
//		
//		Font f3 =new Font("Callibri",Font.ITALIC,18);
		
		Font f =new Font("Times New Roman",Font.BOLD,28);
		
		ImageIcon i1 = new ImageIcon("C:/Users/Prathamesh Kore/Downloads/Login.png");
		
		j5 = new JLabel();
		j5.setIcon(i1);
		
		j1 = new JLabel("Welcome to CoDing Seekho Institute! ");
		j1.setFont(f1);
		j1.setForeground(Color.red);
		j2 = new JLabel("Username");
		j2.setFont(f);
		j2.setBackground(Color.blue);
		j3 = new JLabel("Password");
		j3.setFont(f);
		j3.setForeground(Color.BLUE);
		j4 = new JLabel();

		t1 = new JTextField();
		t2 = new JTextField();

		b1 = new JButton("Login");
		b2 = new JButton("Clear");
		b3 = new JButton("ADD");
		b4 = new JButton("Autofill");

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
		add(b4);
		add(j5);

		j1.setBounds(100, 50, 500, 100);
		j2.setBounds(100, 200, 150, 30);
		j3.setBounds(100, 350, 150, 30);
		j4.setBounds(100, 550, 150, 30);
		t1.setBounds(350, 200, 100, 30);
		t2.setBounds(350, 350, 100, 30);
//		t3.setBounds(200,500,100,30);
		b1.setBounds(200, 450, 100, 30);
		b2.setBounds(400, 450, 100, 30);
		b3.setBounds(500,500,100,30);
		b4.setBounds(300,530,80,20);
		j5.setBounds(200,10,100,100);
		b1.setCursor(c1);
		b2.setCursor(c2);
		b3.setCursor(c3);
		b4.setCursor(c4);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.red);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.ORANGE);
		
		b1.addActionListener(new Log());
		b2.addActionListener(new Clear());
		b3.addActionListener(new Add());
		b4.addActionListener(new Autofill());
		
		j1.addMouseListener(new MouseL());
	}
	
	class MouseL implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
			b2.setBackground(Color.red);
//			j1.setText("ABC");
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
//			j1.setText("mousePressed");
			j1.setForeground(Color.darkGray);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
//			j1.setText("mouseReleased");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
//			j1.setForeground(Color.darkGray);
		}

		@Override
		public void mouseExited(MouseEvent e) {
	
//			j1.setText("mouseExited");
		}
		
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
				JOptionPane.showMessageDialog(null, "Login Successful!");
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
	class Autofill implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e2) {
			
			t1.setText("Coding");
			t2.setText("Seekho");
				
		}
	}

}
