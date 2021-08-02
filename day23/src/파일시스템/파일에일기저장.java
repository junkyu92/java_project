package 파일시스템;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 파일에일기저장 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(32, 51, 179, 49);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(32, 129, 179, 49);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(32, 266, 179, 49);
		f.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(237, 51, 207, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(237, 129, 207, 49);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("굴림", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(237, 209, 207, 168);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				
				try {
					FileWriter fw = new FileWriter(day + ".txt");
					fw.write(day + "\n");
					fw.write(title + "\n");
					fw.write(content + "\n");
					fw.close();
					JOptionPane.showMessageDialog(f, "저장됨.");
				} catch (IOException e1) {
					System.out.println("에러!");
				}
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(97, 393, 331, 58);
		f.getContentPane().add(btnNewButton);
		
		
		
		
		f.setVisible(true);
	}
}
