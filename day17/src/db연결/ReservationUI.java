package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReservationUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;

	public static void main(String[] args) {
		JFrame f = new JFrame("코로나19 예방접종 사전예약 시스템");
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1400, 900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("예약하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(200, 191, 141, 83);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("예약번호");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1.setBounds(271, 284, 149, 67);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("주민등록번호");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(271, 361, 149, 67);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(271, 438, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(130, 68, 225, 67);
		f.getContentPane().add(btnNewButton);
		
		ImageIcon logo = new ImageIcon("logo.png");
		btnNewButton.setIcon(logo);
		
		JButton btnNewButton_1 = new JButton("예약조회/취소");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(685, 133, 192, 48);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("의료기관 찾기");
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(889, 133, 192, 48);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("알림마당");
		btnNewButton_1_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(1093, 133, 149, 48);
		f.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("예약하기");
		btnNewButton_1_3.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_3.setBackground(Color.WHITE);
		btnNewButton_1_3.setBounds(532, 133, 141, 48);
		f.getContentPane().add(btnNewButton_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("백신종류");
		lblNewLabel_1_2_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1_2_1.setBounds(271, 522, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("전화번호");
		lblNewLabel_1_2_1_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1_2_1_1.setBounds(271, 599, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("날짜");
		lblNewLabel_1_2_1_2.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1_2_1_2.setBounds(271, 679, 149, 67);
		f.getContentPane().add(lblNewLabel_1_2_1_2);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(524, 284, 316, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(524, 361, 316, 56);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(524, 449, 316, 56);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(524, 522, 316, 56);
		f.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.BOLD, 30));
		t5.setColumns(10);
		t5.setBounds(524, 594, 316, 56);
		f.getContentPane().add(t5);
		
		t6 = new JTextField();
		t6.setFont(new Font("굴림", Font.BOLD, 30));
		t6.setColumns(10);
		t6.setBounds(524, 679, 316, 56);
		f.getContentPane().add(t6);
		
		JButton btnNewButton_2 = new JButton("예약하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reserv_num = t1.getText();
				String ssn = t2.getText();
				String name = t3.getText();
				String vaccine = t4.getText();
				String tel = t5.getText();
				String date = t6.getText();
				
				ReservationDAO db = new ReservationDAO();
				try {
					int result = db.create(reserv_num, ssn, name, vaccine, tel, date);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "예약 성공");
					} else {
						JOptionPane.showMessageDialog(f, "예약 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.setBounds(954, 758, 165, 48);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
		
	}
}
