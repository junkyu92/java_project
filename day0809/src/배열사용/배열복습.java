package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {
		// 데이터를 알고 있을 경우
		int[] num = { 100, 200, 300 };
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i : num) {
			System.out.println(i);
		}
		
		int[] num2 = new int[3];
		num2[0] = 1000;
		num2[num2.length-1] = 1000;
		for (int i : num2) {
			System.out.println(i);
		}
	}

}
