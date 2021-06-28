package 문제풀이;

import javax.swing.JOptionPane;

public class 게임계속문제 {

	public static void main(String[] args) {
//		2. 게임을 계속하시겠습니까? (0:계속, 1:종료)
//		무한루프 사용
//		첫번째 사람 숫자를 입력: 20
//		두번째 사람 숫자를 입력: 10
//		첫번째 사람 승! //더 큰 숫자를 낸 사람이 승리!
//		종료이면 게임을 stop!
		
		while (true) {
			String game = JOptionPane.showInputDialog("게임을 계속하시겠습니까? (0:계속, 1:종료)");	//game 이라는 변수에 입력값 저장
			if (game.equals("1")) {															//입력값이 1일 경우 
				System.exit(0);																//프로그램 종료
			} else {																		//그 외의 경우
			String i1 = JOptionPane.showInputDialog("첫번째 숫자 입력");							//숫자 입력
			String i2 = JOptionPane.showInputDialog("두번째 숫자 입력");							//숫자 입력
			
			int a1 = Integer.parseInt(i1);													//스트링으로 입력 받은 숫자를 정수로 저장
			int a2 = Integer.parseInt(i2);													//스트링으로 입력 받은 숫자를 정수로 저장
			
			if (a1 > a2) {																	//첫번째숫자가 클 경우
				JOptionPane.showMessageDialog(null, "첫번째 사람 승!");							//출력
			} else if (a1 < a2) {															//두번째숫자가 클 경우
				JOptionPane.showMessageDialog(null, "두번째 사람 승!");							//출력
				
			} else {																		//그 외의 경우(같은 경우)
				JOptionPane.showMessageDialog(null, "무승부!");								//출력
				
			}

	}

}//while

	}//main
	
}//class