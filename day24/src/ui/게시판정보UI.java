package ui;

import javax.swing.JOptionPane;

import db.게시판DAO;
import dto.게시판Bag;

public class 게시판정보UI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("게시판id입력");
		String title = JOptionPane.showInputDialog("게시판title입력");
		String content = JOptionPane.showInputDialog("게시판content입력");
		String writer = JOptionPane.showInputDialog("게시판writer입력");
		
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		게시판DAO dao = new 게시판DAO();
		dao.create(bag);
	}

}
