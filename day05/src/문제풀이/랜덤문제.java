package 문제풀이;

import java.util.Random;


public class 랜덤문제 {

	public static void main(String[] args) {
//		1.랜덤문제
//		랜덤한 숫자를 2개 발생시켜서 
//		첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
//		두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		 
		Random r = new Random(); 					// 램에 저장공간을 만들어 랜덤숫자저장
		
		int n1 = r.nextInt(100); 					// 0~99의 랜덤숫자(정수)를 첫번째 변수에 저장
		int n2 = r.nextInt(100); 					// 0~99의 랜덤숫자(정수)를 두번째 변수에 저장
		
		System.out.println(n1);						//첫번째 숫자 출력
		System.out.println(n2); 					//두번째 숫자 출력
		
		if (n1 > n2) {
			System.out.println("첫번째가 더 커요!");		//첫번째 숫자가 더 클 경우 출력
		} else {
			System.out.println("두번째가 더 커요!");		//두번째 숫자가 더 클 경우 출력

		}

		}
		
	}

