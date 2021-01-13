package kh.java.gui.swing.change.panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class CheckBoxTest extends JFrame{

	 JLabel resultLabel;

	public CheckBoxTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		topPanel();
		selectPanel();
		resultPanel();
	}

	private void topPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("과일을 선택하세요.");
		panel.add(label);
		add(panel, BorderLayout.NORTH);
		
	}

	private void selectPanel() {
		JPanel panel = new JPanel();
		JCheckBox[] chks = {
		new JCheckBox("사과"), 
		new JCheckBox("포도"),
		new JCheckBox("수박")
		};
		
		//이벤트핸들러 처리
		for(JCheckBox chk : chks) {
			//각 Checkbox객체에 이벤트리너 바인딩
			chk.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
//					System.out.println("actionPerformed!");
					//중복처리 ↓ 51~56 Util 메시지
					List<String> checkedList = new ArrayList<>();
					for(JCheckBox chk : chks) {
						if(chk.isSelected())
							checkedList.add(chk.getText());
					}
					
					if(checkedList.isEmpty()) {
						resultLabel.setText("아무것도 선택하지 않았습니다.");
					}
					else
						resultLabel.setText(checkedList + "를 선택했습니다.");
				}
			});
		}
		
		for(JCheckBox chk : chks)
			panel.add(chk);
		add(panel);
	}

	private void resultPanel() {
		JPanel panel = new JPanel();
		this.resultLabel = new JLabel("아무것도 선택하지않았어요");
		panel.add(resultLabel);
		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new CheckBoxTest(300,200,"체크박스").setVisible(true);
	}

}
