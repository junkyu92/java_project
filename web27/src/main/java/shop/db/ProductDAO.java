package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;
import shop.dto.게시판Bag;

public class ProductDAO {
	Connection con;
	
	public ProductDAO() {
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

	public ArrayList<ProductDTO> read() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		ResultSet rs = null;
		
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			  
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ProductDTO bag2 = new ProductDTO();
				bag2.setId(rs.getString("id"));
				bag2.setName(rs.getString("name"));
				bag2.setContent(rs.getString("content"));
				bag2.setPrice(rs.getString("price"));
				list.add(bag2);
			}
			System.out.println("4. sql문 전송 전송");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return list;
	}
	
	public ProductDTO read(ProductDTO dto) {
			ResultSet rs = null;
			ProductDTO bag2 = new ProductDTO();
		try {
			String sql = "select * from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");
			  
			rs = ps.executeQuery();
			if(rs.next()) {
				bag2.setId(rs.getString("id"));
				bag2.setName(rs.getString("name"));
				bag2.setContent(rs.getString("content"));
				bag2.setPrice(rs.getString("price"));
			}
			System.out.println("4. sql문 전송 전송");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return bag2;
	}
}
