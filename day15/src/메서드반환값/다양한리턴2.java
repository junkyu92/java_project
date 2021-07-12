package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {
public int get(int x) {
	int result1 = x + 100;
	return result1;
}

public double get() {
	double result2 = 11.11;
	return result2;
}

public int[] get2() {
	int[] result3 = {10, 20, 30, 40, 50};
	return result3;
}

public Random get3() {
	Random r = new Random();
	return r;
}

}
