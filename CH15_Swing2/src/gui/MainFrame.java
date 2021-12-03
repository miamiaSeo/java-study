package gui;

import java.awt.BorderLayout;

import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) { // ������
		super(title); //â�� �̸��� �־ ����
		// �г� �ֱ�
		
		// ���� ���̾ƿ� ����
		setLayout(new BorderLayout());// â�� ������Ʈ�� ���̱� ���� ���̾ƿ� ����
		
//		JPanel panel = new JPanal(); // �г��� ����
//		pannel.setBackground(Color.GREEN);
		
		final MainPanel mainPanel = new MainPanel();
		mainPanel.setBackground(Color.CYAN);
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(new MainPanel(), BorderLayout.CENTER);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}