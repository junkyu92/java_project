package 복습;

public class 복습1 {

	public static void main(String[] args) {
		//오늘을 나타내는 정보를 기본데이터를 이용해서 저장하고 출력해보세요.
		// 오늘 온도 26.2
		// 어제 온도 27.5
		// 어제온도와 오늘온도가 동일한지 프린트
		// 어제온도보다 오늘온도가 높은지도 프린트
		
		int classNo = 8;
		double temp = 26.2;
		char day = '목';
		boolean food = false;
		String lunch = "1층가서 생각해보자."; 
		
		System.out.println("오늘 수업 수 " + classNo);
		System.out.println("오늘 온도 " + temp + "도");
		System.out.println("오늘 요일 " + day);
		System.out.println("아침 먹었나요 " + food);
		System.out.println("점심 어떻게 하지? " + lunch);		
		System.out.println(temp == 27.5);
		System.out.println(temp > 27.5);
		
		//오늘 온도 29.2로 변경하여, 어제의 온도보다 낮은지?
		
		temp = 29.2;
		System.out.println(temp < 27.5);
		
	}

}
