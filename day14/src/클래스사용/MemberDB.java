package 클래스사용;

import java.sql.DriverManager;

public class MemberDB {
	//DB작업
	//1. DB,테이블 생성
	//2. 데이터 조작(CRUD, Create Read Update Delete)
	
	String ip = "localhost";
	String port = "3306";
	String user = "root";
	String pass = "1234";
	
	
	public void login(String id, String pw) {
		
		//회원가입시 샤용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}
	
	public void create(String id, String pw, String name, String tel) throws Exception {
		//java와 mysql과의 연결 순서 정해져있음.(JDBC프로그래밍)
		//Java DB Connectivity
		//1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공!!!");
		
		//2. mysql server의 DB와 연결하고 승인을 받자
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
		DriverManager.getConnection(url, user, pass);
		System.out.println("2.mySQL서버 승인/연결 성공!!!");
		
		//3. sql을 만들자
		
		//4. sql을 mysql server에 전송
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(tel);
	}
	
	public void read() {
		System.out.println("예약정보 조회");
	}
	
	public void delete(String id) {
		System.out.println("예약취소");
		System.out.println(id + "님의 취소가 완료되었습니다.");
	}
}
