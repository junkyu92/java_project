package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;

public class 게시판DAO {
	Connection con;
	ResultSet rs;
	게시판Bag bag2 = new 게시판Bag();

	public 게시판DAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shoes db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void create(shop.dto.게시판Bag bag) {
		try {
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
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
		}
	}

	public 게시판Bag read(게시판Bag bag) {
		try {
			String sql = "select * from board where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			
			System.out.println("3. sql문 생성 성공!!!");
			  
//			result = ps.executeUpdate();
			rs = ps.executeQuery();
			
			if(rs.next()) {
				bag2.setId(rs.getString("id"));
				bag2.setTitle(rs.getString("title"));
				bag2.setContent(rs.getString("content"));
				bag2.setWriter(rs.getString("writer"));
			}
			
			System.out.println("4. sql문 전송 전송");
//			System.out.println(rs);
		
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return bag2;
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	public ArrayList<게시판Bag> read() {
		ArrayList<게시판Bag> list = new ArrayList<게시판Bag>();
		
		try {
			String sql = "select * from board";
			PreparedStatement ps = con.prepareStatement(sql);
						
			System.out.println("3. sql문 생성 성공!!!");
			  
//			result = ps.executeUpdate();
			rs = ps.executeQuery();
			
			while(rs.next()) {
				게시판Bag bag2 = new 게시판Bag();
				bag2.setId(rs.getString("id"));
				bag2.setTitle(rs.getString("title"));
				bag2.setContent(rs.getString("content"));
				bag2.setWriter(rs.getString("writer"));
				list.add(bag2);
			}
			
			System.out.println("4. sql문 전송 전송");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return list;
	}


}

