package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// Switch�� ���� �Է�
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("��� �����Ͻðڽ��ϱ�?");
		
		String input = scanner.nextLine(); // ���ڿ� �Է½� nextLine()
		scanner.close();
		
	
		switch (input) {
		case "y":
			System.out.println("��� �����մϴ�.");
			break; // �׻� ���̽��ϳ� ���� break�ۼ�
		case "n":
			System.out.println("�����մϴ�.");
			break; // �׻� ���̽��ϳ� ���� break�ۼ�
		default: // else�� ����. ���� ���̽��� �´� ���� ���� �� ����
			System.out.println("�߸��� �Է��Դϴ�.");
			break; 

		}

	}

}
