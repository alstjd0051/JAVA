package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame{
	public static CustomPanel[] panels = new CustomPanel[3];
	
	
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, 1000, 600, title);
		
		//panels 객체 할당.
		panels[0] = new CustomPanel(this, Color.pink, "panel0");
		panels[1] = new CustomPanel(this, Color.white, "panel1");
		panels[2] = new CustomPanel(this, Color.lightGray, "panel2");
		
		add(panels[0]); //시작페이지
//		add(panels[1]);
//		add(panels[2]);
	}
	

}
