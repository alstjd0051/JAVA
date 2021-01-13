package kh.java.gui.swing.contatiner;

import javax.swing.JFrame;

//Jframe 상속
public class JFrameTest2 extends JFrame{
	
	public JFrameTest2() {
		setTitle("두번쨰 프레임");
//		setSize(300,200);
//		setLocation(200,200);
		setBounds(200,200,300,200);//10번과 11번줄을 한거번에
		
		//리사이즈 방지
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest2();
	}

}
