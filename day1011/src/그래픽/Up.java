package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up {

	public void up() {
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를 누르세요");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Up2 up2 = new Up2();
				up2.up2();
			}
		});
		f.add(b);
		f.setVisible(true);
	}
}
