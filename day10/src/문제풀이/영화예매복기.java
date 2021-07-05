package 문제풀이;

import java.util.Scanner;

public class 영화예매복기 {

	public static void main(String[] args) {							//main
	
		int[] seat = new int[10];										//int형태의 배열 10개를 저장할 공간 생성
		Scanner sc = new Scanner(System.in);							//키보드에서 입력받아 저장할 공간 생성
		
		int count = 0;													//정수형태의 변수 선언,초기화
		final int MONEY = 10000;										//값이 고정된 정수형태의 변수 선언
		
		while (true) {													//무한 반복문 시작
			System.out.println("--------------------");					
			for (int i = 0; i < 10; i++) {								//0~9까지 숫자 프린트
				System.out.print(" " + i);
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {						//seat배열의 숫자 프린트 
				System.out.print(" " + seat[i]);						//초기화값인 {0,0,0,...,0}
			}
			System.out.println();
			System.out.print("원하시는 좌석번호를 입력하세요.(종료는 -1): ");
			int no = sc.nextInt();										//스캐너로 숫자 입력받아 no라는 변수에 정수형태로 저장
			if (no == -1) {												//입력받은 숫자가 -1일 경우
				System.out.println("시스템 종료.");
				System.out.println(count + "자리 예약되었습니다.");
				int total = count * MONEY;
				System.out.println("지불금액은 " + total + "원");
				break;													//반복문 종료
			}
			if (seat[no] != 1) {										//배열에 저장된 숫자가 1이 아닐경우(입력한 자리가 예약된 자리가 아닐 경우)
				seat[no] = 1;											//배열에 저장된 숫자를 1로 변경(1대입)
				count++;												//카운트 +1
				System.out.println(no + "번 자리 예약되었습니다.");
			} else {													//배열에 저장된 숫자가 1일 경우(이미 예약된 자리)
				System.out.println("이미 예약된 자리입니다.");
			}
			System.out.println();
		}
		sc.close();														//스트림 닫기
	}

}

