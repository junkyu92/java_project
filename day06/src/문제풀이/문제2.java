package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;


public class 문제2 {

	public static void main(String[] args) {
		//나이를 입력: 2
		//=> 태어난 연도는 2020년(Date이용)
		//태어난 시각: 10
		//오전에 태어나셨군요(오전, 오후, 밤, 새벽,...)
		
		String age = JOptionPane.showInputDialog("나이를 입력하세요.");
		int a = Integer.parseInt(age);
		//자동 import ctrl+shift+o, f2
		Date date = new Date();
		int year = date.getYear() + 1900;
		
		System.out.println("태어난 연도는 " + (year - a + 1) + "년");
		
		String hour = JOptionPane.showInputDialog("태어난 시각을 입력하세요.");
		int h = Integer.parseInt(hour);
		
		if (0 <= h && h < 12) {
			if (h <= 5) {
				System.out.println("새벽에 태어나셨군요.");
			} else {
				System.out.println("오전에 태어나셨군요.");
			}
		} else if (12 <= h && h < 24) {
			if (h >= 9) {
				System.out.println("밤에 태어나셨군요.");
			} else {
				System.out.println("오후에 태어나셨군요.");
			}
		} else{
			System.out.println("잘못 입력하셨습니다.");

		}
	}

}
