package db연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 {

	public static void main(String[] args) throws Exception {
		
		String id = JOptionPane.showInputDialog("id입력");
			
		MemberDAO db = new MemberDAO();
		db.delete(id);
		
	
	}

}
