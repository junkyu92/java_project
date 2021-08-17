package shop.dto;

public class DTOTest2 {

	public static void main(String[] args) {
		게시판Bag bag = new 게시판Bag();
		게시판Bag bag2 = new 게시판Bag();
		
		bag.setId("root");
		bag.setTitle("a");
		bag.setContent("1");
		bag.setWriter("root");

		bag2.setId("root1");
		bag2.setTitle("b");
		bag2.setContent("2");
		bag2.setWriter("root1");
		
		System.out.println(bag.toString());
		System.out.println(bag2.toString());
	}

}
