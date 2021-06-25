package 문제풀이;

public class 기본데이터_확인문제 {

	public static void main(String[] args) {
		// 1.
		// 1학기 성적 체육 : 66점
		//			수학 : 77점
		//			영어 : 88점
		//			국어 : 99점
		//모든 점수를 합해 평균을 구해주세요.
		
		int a = 66; //체육점수
		int b = 77; //수학점수
		int c = 88; //영어점수
		int d = 99; //국어점수

		int sum = a + b + c + d; //모든 점수의 합
		double avg = (double)sum / 4; //소수점까지 구하기 위해 더블로 캐스팅 후 평균값 계산 
		
		System.out.println("평균은 " + avg + "입니다.");
		
		
		//2.
		//pi = 3.14, 반지름 2.2
		//원의 면적을 구해주세요
		
		double pi = 3.14; //파이
		double r = 2.2;   //반지름
		double result = pi * r * r;//파이알제곱
		
		System.out.println("원의 면적은 " + result + "입니다.");
		
	}

}
