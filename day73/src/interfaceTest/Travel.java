package interfaceTest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Travel {
	public Travel() {
		JFrame f = new JFrame("ㅡㅡ");
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		String in1 = JOptionPane.showInputDialog("어디로 갈까요?");
		String in2 = JOptionPane.showInputDialog("언제 갈까요?");
		JButton b1 = new JButton("버튼1");
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b1, in1 + "로 " + in2 + "에 떠나요!");
			}
		});
		JButton b2 = new JButton("버튼2");
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b2, new Date().toString());
				
			}
		});
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Travel();
	}
}
