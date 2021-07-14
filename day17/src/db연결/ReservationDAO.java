package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReservationDAO {
	
	
	public int create(String reserv_num, String ssn, String name, String vaccine, String tel, String date) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db연결 성공!!!");
		
		String sql = "insert into reservation values (?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, reserv_num);
		ps.setString(2, ssn);
		ps.setString(3, name);
		ps.setString(4, vaccine);
		ps.setString(5, tel);
		ps.setString(6, date);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송");
		System.out.println("sql문 수행 개수 " + result);
		return result;
	}
	
	public int delete(String reserv_num) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db연결 성공!!!");
		
		String sql = "delete from reservation where reserv_num = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, reserv_num);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송");
		System.out.println(result);
		return result;
	}
	
	public int update(String id, String tel) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공!!!");
		
		String url = "jdbc:mysql://localhost:3306/vaccine_reserv";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. db연결 성공!!!");
		
		String sql = "update reservation set tel = ? where id = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql문 생성 성공!!!");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송");
		System.out.println(result);
		return result;
	}

}
