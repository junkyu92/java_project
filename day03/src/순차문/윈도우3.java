package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_5;
	private static JTextField textField_3;
	private static JTextField textField_4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    나의 일기장");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 60));
		lblNewLabel.setBounds(12, 10, 460, 150);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("******************* 오늘의 일기작성을 시작합니다.  *******************");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(12, 170, 460, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setBounds(22, 195, 29, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("날짜");
		lblNewLabel_3.setBounds(22, 220, 29, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("제목");
		lblNewLabel_4.setBounds(22, 245, 29, 15);
		f.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(52, 192, 406, 21);
		f.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(52, 273, 406, 145);
		f.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.setBounds(81, 428, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBounds(190, 428, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("잠깐");
		btnNewButton_2.setBounds(299, 428, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(52, 217, 406, 21);
		f.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(52, 242, 406, 21);
		f.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("내용");
		lblNewLabel_4_1.setBounds(22, 340, 29, 15);
		f.getContentPane().add(lblNewLabel_4_1);
		f.setVisible(true);
		
	}
}
