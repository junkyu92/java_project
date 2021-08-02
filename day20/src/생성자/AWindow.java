package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AWindow {

	public static void main(String[] args) {
		AWindow a = new AWindow();
		a.open();
	}
	//객체 생성시 클래스이름과 동일한 메서드가 있으면 자동호출됨.
	//생성자 메서드(생성자)
	public AWindow() {
			System.out.println("A객체가 생성");
	}
	
	public void open() {
		JFrame f = new JFrame("A");
		f.setSize(300, 300);
		JButton b = new JButton("B open");
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				BWindow dao = new BWindow();
				dao.open();
				f.dispose();
			}
		});
		f.add(b);
		f.setVisible(true);
	}

}
