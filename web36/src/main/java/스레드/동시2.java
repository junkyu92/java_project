package 스레드;

import java.util.Iterator;

public class 동시2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시2>> " + i);
		}
	}
}

