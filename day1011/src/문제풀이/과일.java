package 문제풀이;

import java.util.Scanner;

public class 과일 {

	public static void main(String[] args) {
		/*참고, 사과/바나나 2천원, 포도/키위 3천원
		 *================
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>>
		 *================
		 *사과가 선택되었습니다.
		 *
		 *0
		 *시스템이 종료됩니다.
		 *사과: 3개
		 *바나나: 2개
		 *포도: 1개
		 *키위: 2개
		 *구매하려면 전체 금액은 @@원입니다.
		 */
		Scanner sc = new Scanner(System.in);
		String[] fruit = {"사과", "바나나", "포도", "키위"};
		int[] fruitNum = new int[4];
		
		while (true) {
			System.out.println("================");
			System.out.print(" 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> ");
			int no = sc.nextInt();
			System.out.println("================");
			if (no == 0) {
				System.out.println("시스템이 종료됩니다.");
				for (int i = 0; i < fruitNum.length; i++) {
					System.out.println(fruit[i] + ": " + fruitNum[i] + "개");
				}
				int total = (fruitNum[0] + fruitNum[1]) * 2000 + (fruitNum[2] + fruitNum[3]) * 3000;
				System.out.println("구매하려면 전체 금액은 " + total + "원입니다.");
				break;
			} 
			fruitNum[no - 1]++;
			System.out.println(fruit[no - 1] + "가 선택되었습니다.");
			System.out.println();
		}
		sc.close();
	}

}
