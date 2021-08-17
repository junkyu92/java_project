package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 게시판DAO {
	
	//메더스(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을 중간에 저장할 목적으로 매개체 역할을 해주는 변수
	//				매개변수, 파라메터, parameter
	public void create(shop.dto.게시판Bag bag) {
		//메서드 안에서 만들어진 변수임.
		//변수는 "타입 변수명;"만들어짐.(선언!)
		//선언의 위치가 변수의 생존범위를 결정함.
		//파라메터는 지역변수이다. 지 지역을 벗어나서는 사용 불가능
		//지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "insert into board values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");
			  
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
		}
	}
	//하나의 이름으로 메서드이름을 쓸 수 있다.
	//입력값의 형태가 다양한 형태이어야 한다.
	//다형성(오버로딩)
	public void read(String id) {
		
	}
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
