package 스레드;

public class 동시처리Main1 {

	public static void main(String[] args) {
		동시1 thread1 = new 동시1();
		동시2 thread2 = new 동시2();
		
		thread1.start();
		thread2.start();
		
		
	System.out.println("스레드종료");
	}

}
