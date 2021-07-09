package 클래스사용;

import javax.swing.JOptionPane;

import 클래스생성.BdsDB;

public class 게시물삭제 {

	public static void main(String[] args) {
		BdsDB db = new BdsDB();
		String title = JOptionPane.showInputDialog("삭제할 제목을 입력하세요.");
		
		db.delete(title);
	}

}
