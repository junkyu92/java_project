package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		String id2 = "root";//회원가입시 가입한 id
		String pw2 = "pass";//회원가입시 가입한 pw
		//기본형 데이터가 아니면 연산자를 가지고 비교할 수 없다.
		//String 비교는 .equals 
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		System.out.println(id.equals(id2) && pw.equals(pw2));
		//and 연산자인 경우, 중요한 체크를 할 비교를 첫번째에 넣는다.
		//첫번째 비교에서 false가 나오면, 이후의 비교연산자는 실행되지 않는다.
		if (id.equals(id2) && pw.equals(pw2)) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		
		}
	} // main

} // class
