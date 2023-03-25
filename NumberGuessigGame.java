package com.NumberGeussing;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JToolBar;
public class NumberGuessigGame{

	private JFrame frame;
	private JTextField textField;
	private JTextField txt_result;
	Random rnd=new Random();
	private int computerNumber=rnd.nextInt(10);
	private int score=0;
	private int time=0;
	private JTextField txtTime;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGuessigGame window = new NumberGuessigGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NumberGuessigGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setResizable(false);
		frame.setBounds(100, 100, 541, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel wlcm_lbl = new JLabel("Welcom To NumberGuessing Game");
		wlcm_lbl.setBounds(116, 0, 292, 37);
		wlcm_lbl.setForeground(new Color(255, 255, 255));
		wlcm_lbl.setBackground(new Color(64, 0, 64));
		wlcm_lbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(wlcm_lbl);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(79, 153, 60, 37);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_1);
		
	    JButton btn_2 = new JButton("2");
	    btn_2.setBounds(155, 153, 60, 37);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(236, 153, 60, 37);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(319, 153, 60, 37);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(395, 153, 60, 37);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(116, 201, 60, 37);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(201, 201, 60, 37);
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBounds(288, 201, 60, 37);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(372, 201, 60, 37);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBounds(247, 243, 60, 37);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(btn_0);
		
		textField = new JTextField();
		textField.setBounds(155, 93, 211, 37);
		textField.setBackground(Color.CYAN);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_Guess = new JButton("Guess");
		btn_Guess.setBounds(395, 110, 89, 32);
		btn_Guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int userNumber=Integer.parseInt(textField.getText());
			int remainTime=0;
			if(userNumber==computerNumber) {
				time++;
				if(time==1) {
				    score=100;}
				else {
					score=100-(time*10);
				}
				if(score>0) {
				   JOptionPane.showMessageDialog(null,"You Won ,Your Score is "+score+" You Guessed it in  "+time+"   time");
				   score=0;
				   time=0;
				   remainTime=10-time;
				   String s=Integer.toString(remainTime);
				   txtTime.setText(s);   
				}
				else {
					score=0;
					JOptionPane.showMessageDialog(null,"You Loss the Game, Your Score is  "+score);
					   
				}
				textField.setText("");
				txt_result.setText("");
				txtTime.setText("0");
			    computerNumber=rnd.nextInt(10);
			}
			else if(userNumber>computerNumber) {
				time++;
				txt_result.setText("You guessed greater Number");
				   remainTime=10-time;
				   String s=Integer.toString(remainTime);
				   txtTime.setText(s);
				textField.setText("");
				
			}
			else {
				time++;
				txt_result.setText("You guessed lower Number");
				   remainTime=10-time;
				   String s=Integer.toString(remainTime);
				   txtTime.setText(s);
				textField.setText("");
				
			}
			}
		});
		btn_Guess.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btn_Guess);
		
		txt_result = new JTextField();
		txt_result.setBounds(155, 45, 211, 37);
		txt_result.setForeground(new Color(0, 255, 0));
		txt_result.setBackground(new Color(64, 0, 64));
		txt_result.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(txt_result);
		txt_result.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setBounds(487, 62, 28, 20);
		txtTime.setText("0");
		txtTime.setForeground(new Color(255, 255, 255));
		txtTime.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Time :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 255, 64));
		lblNewLabel.setBounds(448, 61, 46, 21);
		frame.getContentPane().add(lblNewLabel);
	}
}
