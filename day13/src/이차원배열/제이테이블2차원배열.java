package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 제이테이블2차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		String[] title = {"컴퓨터", "영어", "수학", "회화"};
		
		String[][] contents = {
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"100", "88", "99", "77"},
				{"60", "87", "79", "78"},
				{"90", "83", "89", "79"},
				{"80", "86", "59", "80"}
		};
		JTable table = new JTable(contents, title);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}

}
