package 생성자;

import java.util.HashMap;

public class 휴대폰단축키 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put(1, "엄마");
		dic.put(2, "아빠");
		dic.put(3, "친구");
		dic.put(4, "동생");
		System.out.println(dic.get(2));
	}

}
