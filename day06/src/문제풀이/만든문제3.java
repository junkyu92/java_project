package 문제풀이;

import javax.swing.JOptionPane;

public class 만든문제3 {

	public static void main(String[] args) {

		//몇조인지 입력하고 학원에 오는 날 출력
		
		String num = JOptionPane.showInputDialog("몇조인지 입력하세요.");
		char jo = num.charAt(0);
		
		if (jo == '1') {
			JOptionPane.showMessageDialog(null, "월요일에 학원에 오시면 됩니다.");
		} else if (jo == '2') {
			JOptionPane.showMessageDialog(null, "화요일에 학원에 오시면 됩니다.");
		} else if (jo == '3') {
			JOptionPane.showMessageDialog(null, "수요일에 학원에 오시면 됩니다.");
		} else if (jo == '4') {
			JOptionPane.showMessageDialog(null, "목요일에 학원에 오시면 됩니다.");
		} else if (jo == '5') {
			JOptionPane.showMessageDialog(null, "금요일에 학원에 오시면 됩니다.");
		} else {
			JOptionPane.showMessageDialog(null, "잘못입력하셨습니다.");
		}
		
	}

}
