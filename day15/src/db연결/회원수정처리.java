package db연결;

import javax.swing.JOptionPane;

public class 회원수정처리 {

	public static void main(String[] args) throws Exception {
		//string sql = "update member set tel = ? where id = ?"
		String id = JOptionPane.showInputDialog("id입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
			
		MemberDB db = new MemberDB();
		db.update(id, tel);
		
	
	}

}
