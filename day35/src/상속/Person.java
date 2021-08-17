package 상속;

public class Person {
	String name;
	int age;
	
	//기본 생성자는 다른 생성자메서드가 없으면 자동생성 
	//          다른 생성자메서드가 있으면 자동 생성되지 않는다.
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void think() {
		System.out.println("생각하다. ");
	}
	
	public void tool() {
		System.out.println("도구를 이용하다.");
	}
}

