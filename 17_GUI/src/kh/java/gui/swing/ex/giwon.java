package kh.java.gui.swing.ex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class giwon extends JFrame {
	private JPanel win;

	public giwon(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		JPanel linkpanel = new JPanel();
		ImagePanel panel = new ImagePanel("images/coffe.jpg");
		JButton bt1 = new JButton("***메뉴입력***"); // 갈색 메뉴판 버튼 패널 변경
		JButton bt2 = new JButton("칼리다 드립"); // 아메리카노 이미지
		JButton bt3 = new JButton("고노 드립"); // 에스프레레소 이미지
		JButton bt4 = new JButton("멜리타 드립"); //
		JButton bt5 = new JButton("하리오 드립");
		JButton back1 = new JButton("→");
		linkpanel.add(bt1);
		linkpanel.add(bt2);
		linkpanel.add(bt3);
		panel.setLayout(null);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(back1);
		// add 사용
		bt1.setBounds(10, 5, 150, 50);
		bt2.setBounds(10, 47, 150, 50);
		bt3.setBounds(10, 90, 150, 50);
		bt4.setBounds(10, 130, 150, 50);
		bt5.setBounds(10, 170, 150, 50);
		back1.setBounds(245, 3, 150, 50);
		// 위치 설정
		bt1.setFocusable(false);
		bt2.setFocusable(false);
		bt3.setFocusable(false);
		bt4.setFocusable(false);
		bt5.setFocusable(false);
		back1.setFocusable(false);
		// 폰트설정
		bt1.setFont(new Font("맑은고딕", Font.BOLD, 14));
		bt2.setFont(new Font("맑은고딕", Font.BOLD, 14));
		bt3.setFont(new Font("맑은고딕", Font.BOLD, 14));
		bt4.setFont(new Font("맑은고딕", Font.BOLD, 14));
		bt5.setFont(new Font("맑은고딕", Font.BOLD, 14));
		back1.setFont(new Font("맑은고딕", Font.BOLD, 30));
		// 버튼위치와 크기 설정
		Color co1 = new Color(192, 127, 90); // 버튼색깔추가
		Color co2 = new Color(255, 217, 180);
		Color co3 = new Color(255, 217, 180);
		Color co4 = new Color(255, 217, 180);
		Color co5 = new Color(255, 217, 180);
		Color co6 = new Color(234, 234, 234);
		bt1.setBackground(co1);
		bt2.setBackground(co2);
		bt3.setBackground(co3);
		bt4.setBackground(co4);
		bt5.setBackground(co5);
		back1.setBackground(co6);
		add(panel);
		pack();
	}

	public class ImagePanel extends JPanel {
		private BufferedImage image;
		private int w;
		private int h;
		protected JFrame f;

		public ImagePanel(String fileName) {
			try {
				image = ImageIO.read(new File(fileName));
				w = image.getWidth();
				h = image.getHeight();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/**
		 * 현재 패널크기를 백그라운드 이미지의 크기로 지정
		 */
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w, h);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			// img객체를 x,y값만큼 떨어뜨려(offset) 그리기 메소드
			// boolean java.awt.Graphics.drawImage(Image img, int x, int y, ImageObserver
			// observer)
			g.drawImage(image, 0, 0, null);
		}

	}

	public static void main(String[] args) {
		new giwon(500, 500, "핸드드립커피").setVisible(true);

	}

}