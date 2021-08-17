package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
		GiantBaby baby = new GiantBaby();
		
		baby.age = 1;
		baby.name = "aa";
		baby.walking = false;
		baby.weight = "15Kg";
		
		System.out.println(baby);
		baby.big();
		baby.cute();
	}

}
