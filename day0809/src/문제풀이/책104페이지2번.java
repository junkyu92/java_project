package 문제풀이;

public class 책104페이지2번 {

	public static void main(String[] args) {
		//1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오.
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		
		System.out.println("짝수의 합은 " + sum1);
		System.out.println("홀수의 합은 " + sum2);
	}

}
