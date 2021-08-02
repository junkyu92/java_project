package 새창데이터전달;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {

	public void open3(String id, String pw) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		if (id.equals("root") && pw.equals("pass")) {
			f.setTitle("로그인 성공");
			f.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(f, "로그인 실패!");
		}
		
	}
	
}
