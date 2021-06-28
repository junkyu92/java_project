package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형의넓이 {

	public static void main(String[] args) {

		//사각형의 넓이를 구하자.
		//가로크기: 33.3
		//세로크기: 22.2
		//사각형의 넓이는 ****입니다.
		
		String x = JOptionPane.showInputDialog("가로크기");
		String y = JOptionPane.showInputDialog("세로크기");
		
		double x2 = Double.parseDouble(x);
		double y2 = Double.parseDouble(y);
		
		double s =  x2 * y2;
		
		JOptionPane.showMessageDialog(null, "사각형의 넓이는 " + s + "입니다.");

	}

}
