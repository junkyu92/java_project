package 메서드반환값;

public class 계산기 {
	//성질: 멤버변수
	//동작: 멤버메서드
	//cal.add(100, 200)
	//기능정의, 함수정의, 메서드정의
	//x, y는 지역변수, add안에서만 사용 가능
	//메서드 안에서 값을 전달할목적으로 생성되는 변수
	//x, y: 매개변수, parameter
	//void: 반환값이 없다.
	public int add(int x, int y) {
		int r = x + y;
		System.out.println("두 수의 합은 " + r);
		return r;
	}

}
