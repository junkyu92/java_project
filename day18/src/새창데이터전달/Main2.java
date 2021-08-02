package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

   public static void main(String[] args) {
      JFrame f = new JFrame("main창...!!여기서 시작.@@@");
      f.getContentPane().setBackground(Color.MAGENTA);
      f.setSize(447, 546);
      Font font = new Font("궁서", Font.BOLD, 45);
      f.getContentPane().setLayout(null);
      
      t1 = new JTextField();
      t1.setBackground(Color.PINK);
      t1.setFont(new Font("굴림", Font.BOLD, 20));
      t1.setBounds(86, 10, 283, 61);
      f.getContentPane().add(t1);
      t1.setColumns(10);
      
      t2 = new JTextField();
      t2.setBackground(Color.PINK);
      t2.setFont(new Font("굴림", Font.BOLD, 20));
      t2.setColumns(10);
      t2.setBounds(86, 81, 283, 61);
      f.getContentPane().add(t2);
      
      JButton b1 = new JButton("로그인처리");
      b1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		새창3 open3 = new 새창3();
      		String id = t1.getText();
      		String pw = t2.getText();
      		open3.open3(id, pw);
      		f.dispose();
      	}
      });
      b1.setFont(new Font("궁서", Font.BOLD, 45));
      b1.setBackground(Color.GREEN);
      b1.setBounds(86, 152, 283, 61);
      f.getContentPane().add(b1);
      
      JLabel lblNewLabel = new JLabel("id");
      lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
      lblNewLabel.setBounds(12, 10, 64, 61);
      f.getContentPane().add(lblNewLabel);
      
      JLabel lblPw = new JLabel("pw");
      lblPw.setFont(new Font("굴림", Font.BOLD, 20));
      lblPw.setBounds(12, 81, 64, 61);
      f.getContentPane().add(lblPw);
      
      JLabel lblPw_1 = new JLabel("오늘의 온도");
      lblPw_1.setFont(new Font("굴림", Font.BOLD, 20));
      lblPw_1.setBounds(12, 299, 129, 61);
      f.getContentPane().add(lblPw_1);
      
      t3 = new JTextField();
      t3.setBackground(Color.PINK);
      t3.setFont(new Font("굴림", Font.BOLD, 20));
      t3.setColumns(10);
      t3.setBounds(138, 299, 283, 61);
      f.getContentPane().add(t3);
      
      JButton b2 = new JButton("결정");
      b2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		String temp = t3.getText();
      		int t = Integer.parseInt(temp);
      		
      		새창4 open4 = new 새창4();
      		open4.open4(t);
      		f.dispose();
      	}
      });
      b2.setFont(new Font("궁서", Font.BOLD, 45));
      b2.setBackground(Color.GREEN);
      b2.setBounds(66, 394, 283, 61);
      f.getContentPane().add(b2);
      
      f.setVisible(true);
   }
}