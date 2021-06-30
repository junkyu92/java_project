package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------");
		
		int sum2 = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
				//반복문을 계속하라는 의미
				//조건에 맞는 경우 아래에 있는 코드는 더이상 실행 안됨
				//제외의 의미
			}
			
			if (sum2 >= 20) {
			System.out.println("20보다 합이 크므로 stop");
			break;
			}
			
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
	}

}
