package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Down {

	public void down() {
		JFrame f = new JFrame("다운프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 누르세요");
		f.add(b);
		f.setVisible(true);
	}
}
