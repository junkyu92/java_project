package 문제풀이;

public class 반복조건2 {

	public static void main(String[] args) {
		//1부터 100까지 중 3씩 점프해주세요
		//만약 더한 값이 100이 넘으면 더하기 종료
		//5의 배수는 더하지 않습니다.
		
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i <= 100; i = i + 3) {
			
			if (sum > 100) {
				System.out.println("더한 값이 100이 넘으르모 종료.");
				break;
			}
			
			if (i % 5 == 0) {
				continue;
			}
			
			sum = sum + i;
			count++;
			
		}
		System.out.println(sum);
		System.out.println(count);
		
	}

}
