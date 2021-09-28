package com.mega.mvc08.casting;

public class Truck<T, R> {
T weight;
R distance;
@Override
public String toString() {
	return "Truck [weight=" + weight + ", distance=" + distance + "]";
}

}
