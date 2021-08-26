package com.mega.mvc05.static1;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum += time;
	}
	
	public static float getAvg() {
		return (float)sum/count;
	}

	
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
