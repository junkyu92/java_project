package 문제풀이;

public class 문제풀이3 {

	public static void main(String[] args) {
		//생수값 1000, 생수구매개수 2,
		//마스크값 2000, 마스크구매개수 3
		//내가 지불해야할
		//1)생수값 금액은 얼마?
		//2)마스크값 금액은 얼마?
		//3)총 지불금액은 얼마?
		
		int wCost = 1000;
		int w = 2;
		int mCost = 2000;
		int m = 3;
		
		int wTotal = wCost * w;
		int mTotal = mCost * m;
		int total = wTotal + mTotal;
				
		System.out.println("생수값은 총 " + wTotal + "원 입니다.");
		System.out.println("마스크값은 총 " + mTotal + "원 입니다.");
		System.out.println("총 지불금액은 " + total + "원 입니다.");
		
	}

}
