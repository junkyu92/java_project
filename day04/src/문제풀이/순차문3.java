package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
//		숫자1입력: 333
//		숫자2입력: 222
//		
//		두 숫자를 정수로 변환해서 더하기 뻬기 결과 출력

		String num1 = JOptionPane.showInputDialog("숫자1입력"); //첫번째 입력값
		String num2 = JOptionPane.showInputDialog("숫자2입력"); //두번째 입력값
		
		int num3 = Integer.parseInt(num1); //첫번째 입력값을 정수로 변환
		int num4 = Integer.parseInt(num2); //두번째 입력값을 정수로 변환
		
		System.out.println("더하기 결과는 " + (num3 + num4));
		System.out.println("빼기 결과는 " + (num3 - num4));
	}

}
