package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {

		int[] seat = new int[200];
		
		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 730);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + "");
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;
					//JOptionPane.showMessageDialog(f, index + "번 예약됨");
					b.setEnabled(false);
					b.setBackground(Color.red);
					
				}
			});
			f.add(b);
			
		}
		
		JButton b2 = new JButton("<<<<<<<<<<결제하기>>>>>>>>>>");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				final int MONEY = 10000;
				String sum = "";
				for (int i = 0; i < 200; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
					} 
				}
				int payment = count * MONEY;
				JOptionPane.showMessageDialog(f, "당신이 결제할 금액은 " + payment + "원입니다.");
				JOptionPane.showMessageDialog(f, sum + "예약되었습니다.");
			}
		});
		b2.setBackground(Color.YELLOW);
		f.add(b2);
		
		f.setVisible(true);
	}

}
