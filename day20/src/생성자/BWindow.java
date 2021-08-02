package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BWindow {

	//객체 생성시 클래스이름과 동일한 메서드가 있으면 자동호출됨.
		public BWindow() {
				System.out.println("B객체가 생성");
		}
	
	public void open() {
		JFrame f = new JFrame("B");
		f.setSize(300, 300);
		JButton b = new JButton("A open");
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				AWindow dao = new AWindow();
				dao.open();
				f.dispose();
			}
		});
		f.add(b);
		f.setVisible(true);
	}

}
