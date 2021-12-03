package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

import javax.swing.JPanel;

class RedButtonListener implements ActionListener{
	
	private MainPanel  mainPanel;
	private Color c;
	
	public RedButtonListener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("������ ��ư Ŭ��!");
		mainPanel.setBackground(c);
	}	
}


//class BlueButtonListener implements ActionListener{
//	
//	private MainPanel mainPanel;
//	
//	public BlueButtonListener(MainPanel mainPanel) {
//		this.mainPanel = mainPanel;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		//System.out.println("�Ķ��� ��ư Ŭ��!");
//		mainPanel.setBackground(Color.blue);
//	}	
//}

public class Toolbar extends JToolBar{
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// ��ư�� �̺�Ʈ�� ����('Ŭ��'�̺�Ʈ)
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.BLUE));
		
		
		// ���ٿ� ��ư�� ����
		add(redButton);
		add(blueButton);
	}

}
