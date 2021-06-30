package 문제풀이;

public class 점프해서누적 {

	public static void main(String[] args) {

		//33~222 모두 더해주세요
		//55~4500 2씩 점프
		//0~6000 5씩 점프
		
		int sum1 = 0;
		for (int i = 33; i <= 222; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

		int sum3 = 0;
		
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
	
	}

}
