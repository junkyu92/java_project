package com.mega.mvc05.static1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 음식주문프로그램 {
	private static JTextField count;
	static int sum;
	//main이 static이므로, 객체생성하지 않아도 접근이 가능한 변수여야 한다.
	//main안에서 사용하는 전역변수는 반드시 static으로 만들어주어야 한다.
	final static int price=5000;
	static int total;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setBounds(476, 41, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		count = new JTextField("11개");
		count.setForeground(Color.BLUE);
		count.setFont(new Font("굴림", Font.BOLD, 30));
		count.setBackground(Color.YELLOW);
		count.setBounds(538, 10, 165, 67);
		f.getContentPane().add(count);
		count.setColumns(10);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\kkzz0\\Desktop\\1.jpg"));
		img.setBounds(90, 87, 552, 311);
		f.getContentPane().add(img);
		
		JLabel result = new JLabel("결제금액 ");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(37, 397, 623, 54);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				total += price;
				result.setText("결제금액은 " + total + "원 입니다.");
				ImageIcon icon = new ImageIcon("1.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton.setBounds(12, 10, 124, 67);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("짬뽕");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				total += price;
				result.setText("결제금액은 " + total + "원 입니다.");
				ImageIcon icon = new ImageIcon("2.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(161, 10, 124, 67);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("우동");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum++;
				count.setText(sum+"개");
				total += price;
				result.setText("결제금액은 " + total + "원 입니다.");
				ImageIcon icon = new ImageIcon("3.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(307, 10, 124, 67);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
	}
}
