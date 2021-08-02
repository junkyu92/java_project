package 생성자;

public class Phone {
String color;
String model;

public Phone(String color, String model) {
	this.color = color;
	this.model = model;
}

public String toString() {
	return "Phone [color=" + color + ", model=" + model + "]";
}

	
}
