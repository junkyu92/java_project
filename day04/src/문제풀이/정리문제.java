package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(24, 20, 164, 43);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(24, 150, 164, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(24, 307, 164, 43);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setBounds(24, 386, 164, 43);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(260, 22, 201, 41);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setBackground(Color.PINK);
		t2.setColumns(10);
		t2.setBounds(260, 150, 201, 41);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setBackground(Color.CYAN);
		t3.setColumns(10);
		t3.setBounds(260, 307, 201, 41);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 20));
		t4.setBackground(Color.CYAN);
		t4.setColumns(10);
		t4.setBounds(260, 388, 201, 41);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 클릭했을 때 자동으로 이 함수가 실행
				//버튼을 클릭했을 때 처리내용을 넣으면 됨.
				String s1 = t1.getText(); //아메리카노
				if (s1.equals("아메리카노") || s1.equals("주스") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(null, "카페로 가세요.");
				} else {
					JOptionPane.showMessageDialog(null, "집으로 가세요.");
					
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(24, 88, 437, 52);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int a1 = Integer.parseInt(s2);
				int a2 = a1 + 1;
				JOptionPane.showMessageDialog(null, a2 + "살입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(24, 218, 437, 52);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두과목 점수의 평균은?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();

				double n1 = Double.parseDouble(s3);
				double n2 = Double.parseDouble(s4);
				
				double avg = (n1 + n2) / 2;
				JOptionPane.showMessageDialog(null, avg);
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 22));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(24, 455, 437, 52);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
	}
}
