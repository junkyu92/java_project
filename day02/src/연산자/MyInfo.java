package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나에 대한 정보
		// 내이름, 나이, 키, 성별, 점심먹었나요?

		String name = "이준규"; // 스트링(문자열)
		int age = 30;
		double weight = 99.9;
		char gender = 'c';
		boolean food = true; // false,부울렌

		System.out.println(name);
		System.out.println(weight);
		System.out.println(age + 1);
		System.out.println(gender);
		System.out.println(food);

		weight = weight - 10;
		System.out.println(weight);
	}

}
