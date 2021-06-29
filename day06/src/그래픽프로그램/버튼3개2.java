package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(12, 10, 460, 207);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(12, 227, 460, 224);
		f.getContentPane().add(m);
		
		ImageIcon car1 = new ImageIcon("car1.png");
		ImageIcon car2 = new ImageIcon("car2.png");
		
		b.setIcon(car1);
		m.setIcon(car2);
		
		f.setVisible(true);
	}
}
