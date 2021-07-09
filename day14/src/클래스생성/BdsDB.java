package 클래스생성;

public class BdsDB {
	public void create(String title, String contents) {
		System.out.println("제목: " + title);
		System.out.println("내용: " + contents);
	}
	
	public void read(String title) {
		System.out.println("제목이 " + title + "인 게시물 검색");
	}
	
	public void update(String title, String contents) {
		System.out.println("제목을 " + title + "로 변경, 내용을 " + contents + "로변경");
	}
	
	public void delete(String title) {
		System.out.println(title + " 삭제완료");
	}
}
