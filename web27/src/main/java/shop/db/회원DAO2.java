package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

public class 회원DAO2 {
	
	public int create(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "insert into member values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 생성 성공!!!");
			  
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
		}
		return result;
	}
	public 회원Bag read(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		ResultSet rs = null;
		회원Bag bag2 = new 회원Bag();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			
			System.out.println("3. sql문 생성 성공!!!");
			  
//			result = ps.executeUpdate();
			rs = ps.executeQuery();
			
			if(rs.next()) {
				bag2.setId(rs.getString("id"));
				bag2.setPw(rs.getString("pw"));
				bag2.setName(rs.getString("name"));
				bag2.setTel(rs.getString("tel"));
			}
			
			System.out.println("4. sql문 전송 전송");
//			System.out.println(rs);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return bag2;
	}
	public int update(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "update member set tel = ?, name = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");
			  
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
		}
		return result;
	}
	public int delete(회원Bag bag) {
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			
			System.out.println("3. sql문 생성 성공!!!");
			  
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
		}
		return result;
	}

	public ArrayList<회원Bag> read() {
		ArrayList<회원Bag> list = new ArrayList<회원Bag>();
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
			
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
						
			System.out.println("3. sql문 생성 성공!!!");
			  
//			result = ps.executeUpdate();
			rs = ps.executeQuery();
			
			while(rs.next()) {
				회원Bag bag2 = new 회원Bag();
				bag2.setId(rs.getString("id"));
				bag2.setPw(rs.getString("pw"));
				bag2.setName(rs.getString("name"));
				bag2.setTel(rs.getString("tel"));
				list.add(bag2);
			}
			
			System.out.println("4. sql문 전송 전송");
		} catch (ClassNotFoundException e) {
			System.out.println("1번 에러>> 드라이버 없음.!!!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return list;
	}


}
