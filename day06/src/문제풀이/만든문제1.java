package 문제풀이;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 만든문제1 {

	public static void main(String[] args) {
		//1.
		//버튼 누르면 랜덤숫자 나오게하기
		//미리 정해놓은 숫자 뽑으면 당첨

		Random ran = new Random();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("뽑기");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = ran.nextInt(10);
				System.out.println(r);
				
				if (r == 4) {
					JOptionPane.showMessageDialog(f, "4, 당첨입니다.");
				} else {
					JOptionPane.showMessageDialog(f, r + " 꽝!!");
				}
			}
		});
		b.setBackground(Color.RED);
		b.setFont(new Font("굴림", Font.BOLD, 34));
		b.setBounds(77, 136, 291, 110);
		f.getContentPane().add(b);
		
		f.setVisible(true);
		
	}

}
