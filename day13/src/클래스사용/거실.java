package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.color = "black";
		phone1.model = "note20";

		phone1.volumeUp();
		phone1.volumeDown();
		
		System.out.println(phone1.color);
		System.out.println(phone1.model);
		System.out.println();
		
		Dog hodu = new Dog();
		hodu.color = "brown";
		hodu.age = 2;
		
		hodu.shit();
		hodu.eat();
		hodu.bark();
		
	}

}
