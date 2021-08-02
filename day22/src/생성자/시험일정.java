package 생성자;

import java.util.LinkedList;

public class 시험일정 {

	public static void main(String[] args) {
		LinkedList name = new LinkedList();
		name.add("국어");
		name.add("수학");
		name.add("영어");
		name.add("컴퓨터");
		
		System.out.println("전체 시험볼 과목: " + name);
		
		for (int i = 0; i <= name.size(); i++) {
			name.remove();
			System.out.println(i + 1 + "일차 시험본 후 남은 과목: " + name);
		}
	}

}
