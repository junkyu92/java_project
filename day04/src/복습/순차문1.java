package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력 -> 처리 -> 출력의 순서
		// 1.입력
		// 모든 입력데이터는 String으로 읽어온다.
		// 숫자로 쓸지, 스트링 그대로 쓸지는 프로그래머가 결정한다.
		// 숫자로 써야한다면 숫자로 변환하는 처리를 해줘야한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도일까요");

		// 2.처리, "금요일은 27.5도"
		String result = today + "은 " + temp + "도";

		// 3.출력
		System.out.println(result);
		
	} // main

} // class
