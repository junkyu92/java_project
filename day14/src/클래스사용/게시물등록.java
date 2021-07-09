package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.BdsDB;

public class 게시물등록 {

	public static void main(String[] args) {
		BdsDB db = new BdsDB();
		String title = JOptionPane.showInputDialog("제목을 입력하세요");
		String contents = JOptionPane.showInputDialog("내용을 입력하세요");
		
		db.create(title , contents);
	}
}
