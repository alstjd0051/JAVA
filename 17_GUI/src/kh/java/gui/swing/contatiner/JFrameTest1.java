package kh.java.gui.swing.contatiner;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 1. JFrame객체 생성1
 * 	- new JFrame() 직접객체 생성하기
 * 2. JFrame객체 생성2
 * 	- JFrame을 상속한 커스텀 클래스 작성후 객체 생성하기
 */
public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		//제목지정
		f.setTitle("AMF");
		
		
		//윈도우 크기 위치 지정
		f.setSize(300, 200);
//		f.setLocation(500, 300);
		
		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		//X버튼 -> 프로그램 종료 처리
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트 : 컨테이너에 포함된 컴포넌트.
		f.add(new JLabel("Hello Fxker"));
		
		//시각화처리(맨 마지막에 작성)
		f.setVisible(true);
	}

}
