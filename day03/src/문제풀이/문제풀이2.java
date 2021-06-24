package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		// 2.
		// 내 현재나이를 변수에 저장 100
		// 내 내년나이를 계산하고 출력
		// 내 내년나이가 100세를 넘으면 "이제부터 시작",
		// 아니면 "아직 젊어요"
		int age = 100;
		int nAge = age + 1;
		System.out.println(nAge);
		if (nAge > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작");

		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요");

		}

	}

}
