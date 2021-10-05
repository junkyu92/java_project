package interfaceTest;

public class BbsDAO implements BbsDAOInterface {

	@Override
	public void create(int no, String title, String content) {
		System.out.println("bbs테이블에 jdbc 삽입처리!");
	}

	@Override
	public void delete(int no) {
		System.out.println("bbs테이블에 jdbc 삭제처리!");

	}

}
