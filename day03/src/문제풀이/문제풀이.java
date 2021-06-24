package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1.
		// 변수에 저장: 커피개수 5잔, 커피값 5000원
		// 총 커피값을 계산하고 출력
		// 커피값이 20000을 넘으면 "할인해드릴게요." 프린트
		// 넘지 않으면 "총 커피값을 내세요"
		int num = 5;
		int cost = 5000;
		int total = num * cost;
		System.out.println("총 커피값은 " + total + "원입니다.");

		if (total > 20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요.");
		} else {
			JOptionPane.showMessageDialog(null, "총 " + total + "원을 내세요");
		}

	}

}
