package 문제풀이;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 만든문제2 {

	public static void main(String[] args) {
		//버튼 10개중에 당첨 뽑기
		
		JFrame f = new JFrame();
		f.setSize(450, 600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton btnNewButton = new JButton("1번");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "당첨입니다.");
			}
		});
		f.getContentPane().add(btnNewButton);
		
		for (int i = 2; i < 51; i++) {
			JButton b1 = new JButton(i + "번");
			f.getContentPane().add(b1);
			b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "꽝꽝꽝");
				}
			});
		}
		
		f.setVisible(true);
	}

}
