package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUi {
	
	
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(45, 33, 134, 65);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(191, 33, 229, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(191, 108, 229, 47);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(45, 108, 134, 65);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(191, 174, 229, 47);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(45, 174, 134, 65);
		f.getContentPane().add(lblNewLabel_2);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(191, 241, 229, 47);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_3.setBounds(45, 241, 134, 65);
		f.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(id, pw, name, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원가입 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(27, 330, 97, 84);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 id입력");
				MemberDAO db = new MemberDAO();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
					} else {
						JOptionPane.showMessageDialog(f, "회원탈퇴 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(178, 330, 97, 84);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("전화번호를 변경할 id입력");
				String tel = JOptionPane.showInputDialog("변경할 전화번호 입력");
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(id, tel);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.setBounds(323, 330, 97, 84);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
	}
}
