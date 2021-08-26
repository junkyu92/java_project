package com.mega.mvc05.static1;

public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("자바", 10, "강남");
		System.out.println(Day.count);
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.sum);
		System.out.println(Day.getAvg());
	}
}
