package 문제풀이;


public class 깊은복사 {

	public static void main(String[] args) {
		String[] subject = {"국어","영어","수학","컴퓨터","회화"};
		int[] jumsu1 = {44,66,22,99,100};
		int[] jumsu2 = jumsu1.clone();
		jumsu2[0] = 22;
		jumsu2[2] = 88;
		
		int count1 = 0;
		int count2 = 0;
		
		System.out.print("              ");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ");
		}
		
		System.out.print("\n전체 1학기 성적 >> ");
		for (int i = 0; i < jumsu1.length; i++) {
			System.out.print(jumsu1[i] + " ");
		}
		System.out.print("\n전체 2학기 성적 >> ");
		for (int i = 0; i < jumsu2.length; i++) {
			System.out.print(jumsu2[i] + " ");
		}
				
		System.out.print("\n\n1학기, 2학기 성적 중 동일한 성적과목수 >> ");
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i] == jumsu2[i]) {
				count1++;
			} 
		}
		System.out.println(count1);
		
		System.out.print("\n1학기, 2학기 성적 중 오른 과목수 >> ");
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i] <jumsu2[i]) {
				count2++;
			}
		}
		System.out.println(count2);
		
		System.out.print("\n1학기, 2학기 성적 중 오른 과목명 >> ");
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu1[i] <jumsu2[i]) {
				System.out.println(subject[i]);
			}
		}
		
		}
	}
