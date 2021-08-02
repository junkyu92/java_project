package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 새창1 {
	public void open1(String m) {
	      JFrame f = new JFrame(m);
	      f.setSize(500, 500);
	      JButton b1 = new JButton("새창1버튼 화면닫기");
	      b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
				f.dispose();
			}
		});
	      f.add(b1);
	      b1.setBackground(Color.pink);
	      f.setVisible(true);
	   
	}
}
