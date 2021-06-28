package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		// 1부터 5까지 반복해서 찍어보자.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

		}
		
		//1부터 10까지 중 2씩 점프해서 찍어보자.
		//1부터 100까지 중 5씩 점프해서 찍어보자.
		//100부터 1까지 1씩 점프해서 찍어보자.
		//1000부터 0까지 8씩 점프해서 찍어보자.
		for (int i2 = 1; i2 <= 10; i2 = i2+2) {
			System.out.println(i2);
		}
		
		for (int i3 = 1; i3 <= 100; i3 = i3 + 5) {
			System.out.println(i3);
		}
		
		for (int i4 = 100; i4 >= 1; i4--) {
			System.out.println(i4);
		}
		
		for (int i5 = 1000; i5 >= 0; i5 = i5 - 8) {
			System.out.println(i5);
		}
	}

}
