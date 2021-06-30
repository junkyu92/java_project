package 문제풀이;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		String id = "root";
		String pw = "1111";
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("아이디:");
		l1.setFont(new Font("굴림", Font.BOLD, 33));
		l1.setBounds(12, 77, 141, 57);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("패스워드:");
		l2.setFont(new Font("굴림", Font.BOLD, 33));
		l2.setBounds(12, 165, 164, 57);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel();
		l3.setForeground(Color.RED);
		l3.setFont(new Font("굴림", Font.BOLD, 33));
		l3.setBounds(12, 469, 206, 57);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 33));
		t1.setBackground(Color.YELLOW);
		t1.setBounds(226, 77, 233, 57);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 33));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(226, 165, 233, 57);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("로그인 확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = t1.getText();
				String pw1 = t2.getText();
				
				if (id1.equals("root") && pw1.equals("1111")) {
					l3.setText("로그인 성공");
				} else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setBackground(Color.PINK);
		b1.setFont(new Font("굴림", Font.BOLD, 33));
		b1.setBounds(12, 341, 254, 81);
		f.getContentPane().add(b1);
		
		JButton b1_1 = new JButton("지우기");
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
			}
		});
		b1_1.setFont(new Font("굴림", Font.BOLD, 33));
		b1_1.setBackground(Color.PINK);
		b1_1.setBounds(278, 341, 183, 81);
		f.getContentPane().add(b1_1);
		f.setVisible(true);
	}
}
