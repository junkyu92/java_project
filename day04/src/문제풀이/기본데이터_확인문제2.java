package 문제풀이;

import javax.swing.JOptionPane;

public class 기본데이터_확인문제2 {

	public static void main(String[] args) {
//1. 설정한 암호는 p였음.
//입력한 암호는 q였음.
//---------------------
//=> 암호가 맞은 경우, pass!출력
//=> 암호가 틀린 경우, 재입력!출력
//
//2. 어제와 오늘의 몸무게 변화는 2.2
//변화가 2보다 크면 다이어트 성공
//
//3. 입력한 암호도 맞았고, 몸무게 변화도 2보다 크다면, 오늘은 성공!, 아니면 내일 다시 도전!

		String pw1 = "p"; //설정한 암호
		String pw2 = JOptionPane.showInputDialog("비밀번호를 입력하세요"); //암호 입력
		if (pw1.equals(pw2)) {
			System.out.println("pass!");
		} else {
			System.out.println("재입력!");
		}
		
		double change = 2.2; //어제와 오늘의 몸무게 변화
		if (change > 2) {
			System.out.println("다이어트 성공");
		}
		
		if (pw1.equals(pw2) && change > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");

		}
	}//main

}
