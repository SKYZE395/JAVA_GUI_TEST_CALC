package bruh;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Test_Calc {
	Float a;
	Float b;
	Float result;
	int flag;
	Test_Calc(){
		JFrame frame = new JFrame();
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		JLabel l3 = new JLabel("THIS IS LIVE TEXT DISPLAYING");
		l3.setBounds(249,50,150,35);
		l3.setFont(new Font("Arial", Font.BOLD, 9));
		
		JTextField tf = new JTextField();
		tf.setBounds(150,290,200,40);
		tf.setText("");
		tf.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel l1 = new JLabel("");
		l1.setBounds(90,250,250,50);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(250,90,130,35);
		ta.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel l2 = new JLabel("THIS IS A SIMPLE CALCULATOR");
		l2.setBounds(0,210,170,55);
		JLabel l7 = new JLabel("AND CAN OPERATE ON ONLY 2 OPERANDS");
		l7.setBounds(0,220,180,55);
		l7.setFont(new Font("Arial", Font.BOLD, 8));
		l2.setFont(new Font("Arial", Font.BOLD, 10));
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("0");
		JButton b11 = new JButton("+");
		JButton b12 = new JButton("-");
		JButton b13 = new JButton("/");
		JButton b14 = new JButton("*");
		JButton b15 = new JButton("=");
		JButton b16 = new JButton("DELETE");
		JButton b17 = new JButton("ALL CLEAR");
		JButton b18 = new JButton("^");
		
		b1.setFont(new Font("Arial", Font.BOLD, 18));
		b2.setFont(new Font("Arial", Font.BOLD, 18));
		b3.setFont(new Font("Arial", Font.BOLD, 18));
		b4.setFont(new Font("Arial", Font.BOLD, 18));
		b5.setFont(new Font("Arial", Font.BOLD, 18));
		b6.setFont(new Font("Arial", Font.BOLD, 18));
		b7.setFont(new Font("Arial", Font.BOLD, 18));
		b8.setFont(new Font("Arial", Font.BOLD, 18));
		b9.setFont(new Font("Arial", Font.BOLD, 18));
		b10.setFont(new Font("Arial", Font.BOLD,18));
		b11.setFont(new Font("Arial", Font.BOLD, 18));
		b12.setFont(new Font("Arial", Font.BOLD, 24));
		b13.setFont(new Font("Arial", Font.BOLD, 24));
		b14.setFont(new Font("Arial", Font.BOLD, 24));
		b15.setFont(new Font("Arial", Font.BOLD, 48));
		b18.setFont(new Font("Arial", Font.BOLD, 18));
		
		
		b1.setBounds(10,10,45,35);
		b2.setBounds(60,10,45,35);
		b3.setBounds(110,10,45,35);
		b4.setBounds(10,70,45,35);
		b5.setBounds(60,70,45,35);
		b6.setBounds(110,70,45,35);
		b7.setBounds(10,130,45,35);
		b8.setBounds(60,130,45,35);
		b9.setBounds(110,130,45,35);
		b10.setBounds(60,190,45,35);
		b11.setBounds(190,10,45,35);
		b12.setBounds(190,60,45,35);
		b13.setBounds(190,110,45,35);
		b14.setBounds(190,160,45,35);
		b15.setBounds(178,210,70,55);
		b16.setBounds(270,130,100,35);
		b17.setBounds(260,180,120,35);
		b18.setBounds(250,10,45,35);
		
		JLabel l5 = new JLabel("ANSWER :");
		l5.setBounds(45,290,100,40);
		l5.setFont(new Font("Arial", Font.BOLD, 19));
		
		tf.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                ta.setText(tf.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                ta.setText(tf.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            //Plain text components don't fire these events.
            }
        });
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("1");
				tf.setText(s1.concat(s2));
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("2");
				tf.setText(s1.concat(s2));
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("3");
				tf.setText(s1.concat(s2));
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("4");
				tf.setText(s1.concat(s2));
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("5");
				tf.setText(s1.concat(s2));
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("6");
				tf.setText(s1.concat(s2));
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("7");
				tf.setText(s1.concat(s2));
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("8");
				tf.setText(s1.concat(s2));
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("9");
				tf.setText(s1.concat(s2));
			}
		});
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1 = new String("");
				s1 = tf.getText();
				String s2 = new String("0");
				tf.setText(s1.concat(s2));
			}
		});
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = new String(tf.getText());
				a = Float.valueOf(s1);
				tf.setText("");
				flag = 1;
				}
				catch(Exception ae) {
					l1.setText("NOTHING TO ADD!!");
				}
			}
		});
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = new String(tf.getText());
				a = Float.valueOf(s1);
				tf.setText("");
				flag = 2;
				}
				catch(Exception ae) {
					l1.setText("NOTHING TO SUBTRACT!!");
				}
			}
		});
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = new String(tf.getText());
				a = Float.valueOf(s1);
				tf.setText("");
				flag = 3;
				}
				catch(Exception e1) {
					l1.setText("NOTHING TO DIVIDE!!");
				}
			}
		});
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = new String(tf.getText());
				a = Float.valueOf(s1);
				tf.setText("");
				flag = 4;
				}
				catch(Exception e2) {
					l1.setText("NOTHING TO MULTIPLY!!");
				}
			}
		});
		
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s1 = new String(tf.getText());
				b = Float.valueOf(s1);
				switch(flag) {
				case(1):{
					result = a+b;
					break;
				}
				case(2):{
					result = a-b;
					break;
				}
				case(3):{
					result = a/b;
					break;
				}
				case(4):{
					result = a*b;
					break;
				}
				case(5):{
					result = (float) Math.pow(a, b);
				}
				}
				String s2 = new String(String.valueOf(result));
				tf.setText(s2);
				}
				catch(Exception e3) {
					l1.setText("ENTER SOME OPERANDS FIRST!!");
				}
			}
		});
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = new String(tf.getText());
				int n = s1.length();
				try {
					tf.setText(s1.substring(0,n-1));
				}
				catch(Exception ae) {
					l1.setText("NOTHING TO DELETE!!");
				}
			}
		});
	
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
			}
		});
		
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e4) {
				try {
					String s1 = new String(tf.getText());
					a = Float.valueOf(s1);
					tf.setText("");
					flag = 5;
					}
					catch(Exception e1) {
						l1.setText("NOTHING EXPONENTIATE!!");
					}
			}
		});
		frame.setTitle("SIMPLE CALCULATOR");
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		frame.add(b11);
		frame.add(b12);
		frame.add(b13);
		frame.add(b14);
		frame.add(b15);
		frame.add(b16);
		frame.add(b17);
		frame.add(tf);
		frame.add(b18);
		frame.add(l5);
		frame.add(l1);
		frame.add(l7);
		frame.add(l3);
		frame.add(ta);
		frame.add(l2);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Test_Calc();
	}
}
