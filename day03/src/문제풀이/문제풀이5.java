package 문제풀이;

public class 문제풀이5 {

	public static void main(String[] args) {
		//국어점수 75, 수학점수 50을 변수에 저장
		//국어점수와 수학점수의 총합을 구해서 프린트
		//평균을 구해서 프린트
		int x = 75;
		int y = 50;
		int sum = x + y;
		System.out.println("국어점수와 수학점수의 총합은 " + sum + "점입니다.");
		
		double avg = sum / (double)2;
		System.out.println("국어점수와 수학점수의 평균은 " + avg + "점입니다.");
	}

}
