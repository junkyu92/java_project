package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection con;
	
	
	public MemberDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			  
			String url = "jdbc:mysql://localhost:3306/hotel_reserv";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("2. db연결 성공!!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String create(MemberDTO dto) {
		int num = 0;
		String result = "회원가입실패";
		try {
			String sql = "insert into member values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getMail());
			ps.setString(5, dto.getTel());
			System.out.println("3. sql문 생성 성공!!!");
			  
			num = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			if(num == 1) {
				result = "회원가입성공";
			}
			
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return result;
	}

	public MemberDTO read(MemberDTO dto) {
		ResultSet rs = null;
		MemberDTO dto2 = new MemberDTO();
		try {
			
			String sql = "select * from member where m_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");
			  
			rs = ps.executeQuery();
			if(rs.next()) {
				dto2.setId(rs.getString("m_id"));
				dto2.setPw(rs.getString("pw"));
				dto2.setName(rs.getString("name"));
				dto2.setMail(rs.getString("mail"));
				dto2.setTel(rs.getString("tel"));
			}
			System.out.println("4. sql문 전송 전송");
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return dto2;
	}
	
	public String update(MemberDTO dto) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		String result = "회원수정실패";
		try {
			String sql = "update member set pw=? where m_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");
			num1 = ps.executeUpdate();
	
			sql = "update member set mail=? where m_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getMail());
			ps.setString(2, dto.getId());
			num2 = ps.executeUpdate();
			
			sql = "update member set tel=? where m_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getTel());
			num3 = ps.executeUpdate();
			
			System.out.println("4. sql문 전송 전송");
			if(num1 == 1 && num2 == 1 && num3 == 1) {
				result = "회원수정성공";
			}
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return result;
	}
	
	public String delete(MemberDTO dto) {
		int num = 0;
		String result = "회원탈퇴실패";
		try {
			String sql = "delete from member m_id=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");
			  
			num = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			if(num == 1) {
				result = "회원탈퇴성공";
			}
		} catch (SQLException e) {
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러발생함..!!!");
			e.printStackTrace();
		}
		return result;
	}
}