package 문제풀이;

import java.util.Date;

public class 시간구하기 {

	public static void main(String[] args) {
		//시간을 구해보세요.
		//10시전이면 굿모닝
		//15시전이면 굿애프터눈
		//20시전이면 굿 이브닝
		//나머지는 굿나잇
		
		//요일이 토/일이면 쉬어요.
		//나머지요일이면 달려요.
		
		//월이 3-5이면 봄
		//		6-8여름
		//		9-11가을
		//		나머지겨울
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if (hour < 10) {
			System.out.println("good morning.");
		} else if (hour < 15) {
			System.out.println("good afternoon.");
		} else if (hour < 20) {
			System.out.println("good evening.");
		} else {
			System.out.println("good night.");
		}
		
		int day = date.getDay();
		
		if (day == 0 || day == 6) {
			System.out.println("쉬어요.");
		} else {
			System.out.println("달려요.");
		}
		
		int month = date.getMonth() + 1;
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else{
			System.out.println("겨울");
		}
		
	
		
	}
}
