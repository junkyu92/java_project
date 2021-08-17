package 스레드;

public class Count1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			System.out.println("count>> " + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
