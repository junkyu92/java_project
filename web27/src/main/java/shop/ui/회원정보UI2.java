package shop.ui;

import javax.swing.JOptionPane;

import shop.db.회원DAO2;
import shop.dto.회원Bag;

public class 회원정보UI2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("회원가입id입력");
		String pw = JOptionPane.showInputDialog("회원가입pw입력");
		String name = JOptionPane.showInputDialog("회원가입name입력");
		String tel = JOptionPane.showInputDialog("회원가입tel입력");
		
		회원DAO2 dao = new 회원DAO2();
		회원Bag bag = new 회원Bag();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		dao.create(bag);
	}

}
