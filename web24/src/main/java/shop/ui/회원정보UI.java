package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO;

public class 회원정보UI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원가입id입력");
		String pw = JOptionPane.showInputDialog("회원가입pw입력");
		String name = JOptionPane.showInputDialog("회원가입name입력");
		String tel = JOptionPane.showInputDialog("회원가입tel입력");
		
		회원DAO dao = new 회원DAO();
		dao.create(id, pw, name, tel);
	}

}
