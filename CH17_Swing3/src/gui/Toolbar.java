package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// ��ư�� �̺�Ʈ�� ����('Ŭ��' �̺�Ʈ)
		redButton.addActionListener(e -> mainPanel.setBackground(Color.RED));

		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.BLUE);
			}
		});

		// ���ٿ� ��ư�� ����
		add(redButton);
		add(blueButton);
	}

}