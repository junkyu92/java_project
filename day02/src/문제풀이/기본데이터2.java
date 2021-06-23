package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {

		// 색 저장(r)
		// 호실 저장(709)
		// 평균나이 저장(27.5)
		// 선언, 대입, 출력

		// 예약어는 저장공간의 공간을 쓸 수 없다. int, char, class 등등
		// 1. 선언
		char color;
		int num;
		double avgAge;// avgAge(자바, 낙타표기법), avg_age(파이썬, 뱀표기법)

		// 2. 할당, 대입
		color = 'r';
		num = 709;
		avgAge = 27.5;
		// 변수(variable, 값이 변한다): 램에 저장공간에 들어갈 값은 변할 수 있다.
		// 램에 만들어지는 저장공간을 변수
		// 변수하나에는 값이 하나만 저장

		// 3. 출력
		System.out.println("색은 " + color);
		System.out.println("호실은 " + num + "호");
		System.out.println("평균나이는 " + avgAge);
		// 한줄 복사: ctrl + alt + 화살표아래
		// 한줄 이동: alt + 화살표
		// 한줄 삭제: ctrl + d
	}

}
