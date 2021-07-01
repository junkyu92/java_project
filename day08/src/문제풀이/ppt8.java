package 문제풀이;

public class ppt8 {

	public static void main(String[] args) {
		//과목명 = 국어 영어 수학 컴퓨터 회화
		//1학기 성적 44 66 22 99 100
		//배열의 깊은 복사 이용
		//2학기 성적 22 66 88 99 100
		
		//1. 전체 1학기, 2학기 성적 프린트
		//2. 점수 동일한 성적 과목수
		//3. 점수 오른 과목수
		//4. 점수 오른 과목명
		
		String[] s = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] a1 = {44, 66, 22, 99, 100};
		int[] a2 = {22, 66, 88, 99, 100};
		
		//1.
		for (int i : a1) {
			System.out.println(i);
		}
		for (int i : a2) {
			System.out.println(i);
		}
		
		//2.
		int n1 = 0;
		for (int i = 0; i < a2.length; i++) {
			if (a1[i] == a2[i]) {
				n1++;
			}
		}
		System.out.println(n1);
		
		//3.
		int n2 = 0;
		
		for (int i = 0; i < a2.length; i++) {
			if (a1[i] < a2[i]) {
				n2++;
			}
		}
		System.out.println(n2);
		
		//4.
		for (int i = 0; i < a2.length; i++) {
			if (a1[i] < a2[i]) {
				System.out.println(s[i]);
			}
		}
	}
}

