package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		//시작값: 3
		//종료값: 10
		//3, 4, ~10까지 프린트
		
		String data = JOptionPane.showInputDialog("시작값");
		String data2 = JOptionPane.showInputDialog("종료값");
		int i = Integer.parseInt(data);
		int i2 = Integer.parseInt(data2);
		
		while (i <= i2) {
			System.out.println(i);
			i++;
		}
	}

}
