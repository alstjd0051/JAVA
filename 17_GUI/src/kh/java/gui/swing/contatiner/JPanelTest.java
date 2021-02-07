package kh.java.gui.swing.contatiner;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 800*500 가운데 위치시키기
 * @author wsc03
 *
 */
public class JPanelTest extends JFrame {
	public JPanelTest() {
		setSize(800,500); //위치
		setLocationRelativeTo(null); //가운데 정렬
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램종료시 종료
		
		//JFrame의 기본 LayoutManager객체는  BorderLayout(기본값)이다.
//		setLayout(new BorderLayout());
		//null layout : layout manager 객체를 사용하지않고 직접 좌표를 지정함.
		setLayout(null);
		
		//자식 컴포넌트를 추가(20~25 중요)
		JPanel panel1 = new JPanel();
//		panel1.setBackground(Color.pink);
		panel1.setBackground(new Color(200,30,58)); //컬러지정
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(100, 50, 300, 400);
		panel1.add(label1);
		add(panel1);
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(100,250,70));
		JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400, 50, 300, 400);
		panel2.add(label2);
		
		
		//프레임에 패널 추가
		add(panel1);
		add(panel2);
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new JPanelTest();
	}

}
