package 조건문;

import java.util.Date;

public class 시간부품 {

	public static void main(String[] args) {

		//date
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println(year + "년 " + month + "월 " + today + "일");
		int day = date.getDay();
		
		if (day == 0) {
			System.out.println("일요일");
		} else if (day == 1) {
			System.out.println("월요일");
		} else if (day == 2) {
			System.out.println("화요일");
		} else if (day == 3) {
			System.out.println("수요일");
		} else if (day == 4) {
			System.out.println("목요일");
		} else if (day == 5) {
			System.out.println("금요일");
		} else {
			System.out.println("토요일");
		} 
	}

}
