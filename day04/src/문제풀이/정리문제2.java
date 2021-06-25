package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제2 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(29, 105, 80, 55);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(29, 182, 80, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(139, 105, 160, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(139, 182, 160, 55);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(null, n1 + n2);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setBounds(29, 265, 128, 72);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(null, n1 - n2);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton_1.setBounds(171, 265, 128, 72);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}

}
