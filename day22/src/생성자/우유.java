package 생성자;

import java.util.LinkedList;

public class 우유 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println("남은우유: " + milk);
		
	}

}
