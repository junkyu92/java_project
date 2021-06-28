package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 아무거나 {

	public static void main(String[] args) {
		//new: 벽돌처럼 사용할 때 ram에 새롭게 복사해서 부품을 사용함.1
//		random r = new random();
//		JFrame f = new JFrame();
//		JButton b1 = new JButton();
		
		Random r = new Random(4);//씨앗값(seed)
		int num = r.nextInt(100); //0-99
		System.out.println(num);
		
		//50보다 작은 임의의 수 생성
		int num1 = r.nextInt(50);
		System.out.println(num1);
		
		//1000보다 작은 임의의 수 생성
		int num2 = r.nextInt(900) + 100; //최소값 설정 방법
		System.out.println(num2);
		
		//5~49
		int num3 = r.nextInt(45) + 5;
		System.out.println(num3);
		
		//3~22
		int num4 = r.nextInt(20) + 3;
		System.out.println(num4);
	}

}
