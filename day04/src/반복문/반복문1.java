package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		//무한, 유한
		while (true) { //무한루프
		System.out.println("나는계속돌아요.!!");
		String q = JOptionPane.showInputDialog("중단하실래요x");
		if (q.equals("x")) {
			break;
			//System.exit(0);
		}
		}
	}

}
d