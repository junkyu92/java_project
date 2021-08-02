package 새창데이터전달;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 새창4 {
	public void open4(int t) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JLabel l1 = new JLabel();
		if (t > 30) {
			l1.setText("폭염");
			f.setTitle("폭염");
		} else {
			l1.setText("견딜만해요!");
			f.setTitle("견딜만해요!");
		}
		f.add(l1);
		f.setVisible(true);
	}

}
