package 문제풀이;

import javax.swing.JOptionPane;

public class 투표 {

	public static void main(String[] args) {
		int i = 0, u = 0, b = 0;
		
		for (int j = 1; j <= 10; j++) {
			String num = JOptionPane.showInputDialog("투표해주세요. (1)아이유, (2)유재석, (3)방탄");
			switch (num) {
			case "1":
				i++;
				break;
			case "2":
				u++;
				break;
			case "3":
				b++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중 입력해주세요.");
				j--;
				break;
			}
		}
		
		System.out.println("아이유에게 투표한 사람은 " + i + "명");
		System.out.println("유재석에게 투표한 사람은 " + u + "명");
		System.out.println("방탄에게 투표한 사람은 " + b + "명");
		
		
		
	}

}
