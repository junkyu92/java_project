package 문제풀이;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
//		사원번호 입력: 기103
//		사원번호 중 첫글자가 	'기'인경우 '기획부이군요'
//						'인'인경우 '인사부이군요'
//						'개'인경우 '개발부이군요'
		
		String num = JOptionPane.showInputDialog("사원번호를 입력하세요.");
		char f = num.charAt(0);
		
		if (f == '기') {
			System.out.println("기획부이군요.");
		} else if (f == '인') {
			System.out.println("인사부이군요.");
		} else if (f == '개') {
			System.out.println("개발부이군요.");
		} else{
			System.out.println("잘못 입력하셨습니다.");
		}
		
		char f2 = num.charAt(1);
		if (f2 == '1' || f2 =='2') {
			System.out.println("임원");
		} else if (f2 == '3') {
			System.out.println("부장");
		} else if (f2 == '4' || f2 =='5') {
			System.out.println("평사원");
		} else{
			System.out.println("해당 직급이 없음.");

		}
		
		
	}

}
