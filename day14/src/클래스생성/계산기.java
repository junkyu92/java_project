package 클래스생성;

public class 계산기 {
	//사칙연산 계산기
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");
	}
	
	public void 더하기(int a, int b) {
		int result = a + b;
		System.out.println("더하기 결과는 " + result);
	}
	
	public void 빼기(int a, int b) {
		int result = a - b;
		System.out.println("빼기 결과는 " + result);
	}
	
	public void 곱하기(int price, int count) {
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 " + result);
	}
	
	public void 나누기(double a, double b) {
		double result = a / b;
		System.out.println("두 수를 나눈 결과는 " + result);
	}
}
