package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		f.add(b);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		b.setFont(font);
		
		f.setVisible(true);
		
		
		
	}

}
