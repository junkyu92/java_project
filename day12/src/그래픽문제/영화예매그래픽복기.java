package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽복기 {

	public static void main(String[] args) {
		int[] seat = new int[200];									//예약한 좌석을 1로 변경해서 예약여부를 판단하기 위한 변수
		JFrame f = new JFrame("영화예매");								
		f.setSize(560, 730);										
		FlowLayout flow = new FlowLayout();							
		f.setLayout(flow);											
		for (int i = 0; i < 200; i++) {								
			JButton b = new JButton(i + "");						
			b.addActionListener(new ActionListener() {				//버튼을 눌렀을때 작동
				
				@Override
				public void actionPerformed(ActionEvent e) {		//ActionEvent 클래스 생성
					String s = e.getActionCommand();				//버튼을 눌렀을 때 스트링 형태로 생성후 s변수에 주소저장
					int index = Integer.parseInt(s);				//s를 인트형태로 변환해서 index에 저장
					seat[index] = 1;								//누른 버튼에 해당하는 배열을 1로 바꿈
					b.setEnabled(false);							//버튼 비활성화
					b.setBackground(Color.red);						//버튼배경색 빨강으로 변경
				}
			});
			f.add(b);												
		}
		JButton b2 = new JButton("결제하기");							
		b2.addActionListener(new ActionListener() {					
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sum = "";									//좌석 번호를 나열하기 위한 변수
				int count = 0;										//예약된 좌석 카운트 변수
				final int MONEY = 10000;							//고정된 영화값 변수
				for (int i = 0; i < seat.length; i++) {				
					if (seat[i] == 1) {								//예약된 좌석일 경우
						count++;									//카운트+1
						sum = sum + i + "번 ";						//sum에 나열
					}
				}
				int total = count * MONEY;							//총 금액 변수
				JOptionPane.showMessageDialog(f, "총 결제금액은 " + total + "원입니다." );
				JOptionPane.showMessageDialog(f, "예약하신 좌석은 " + sum + "입니다.");
				
				f.setTitle("남은 좌석: " + (200 - count) + "석");		//JFrame의 이름 변경
				
			}
		});
		b2.setBackground(Color.yellow);								
		f.add(b2);													
		
		f.setVisible(true);											
	} //main

} //class
