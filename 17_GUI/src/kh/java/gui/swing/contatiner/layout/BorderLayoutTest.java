package kh.java.gui.swing.contatiner.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//JFrame객체의 기본layout은 BorderLayout이다.
		
		JPanel north = new BorderPanel("북", new Color(200,80,60));
		JPanel south = new BorderPanel("남", new Color(100,40,60));
		JPanel east = new BorderPanel("동", new Color(100,80,60));
		JPanel west = new BorderPanel("서", new Color(10,80,60));
		JPanel center = new BorderPanel("가운데", new Color(70,0,90));
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		add(center);
		
	}

	/*
	 * 내부 클래스
	 * 외부클래스에서 자유롭게 가져다 사용할 수 있다.
	 */
	
	public class BorderPanel extends JPanel {
		
		public BorderPanel(String title, Color c) {
			setBackground(c); //배경색 지정
			JLabel label = new JLabel(title);
			add(label); //현재 JPanel객체에 추가
		}
	}
	
	
	public static void main(String[] args) {

		new BorderLayoutTest(500, 500, "Border LayoutTest").setVisible(true);

	}

}
