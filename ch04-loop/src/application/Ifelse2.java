package application;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {

		System.out.println(" 1.Hello! \n 2.�ȳ� \n 3.���α׷�����");

		Scanner scanner = new Scanner(System.in);

		System.out.println("=================");

		System.out.println("�ɼ��� ���� >");
		int numb = scanner.nextInt();
	// Switch case ������ ����
	
	int option = 1;

	switch (option) {
	case 1: // if�� ������ ==�� ���ԵȰŶ� ����.
		System.out.println("Hello~!");
		System.out.println("");
		break; // �׻� ���̽��ϳ� ���� break�ۼ�
	case 2:
		System.out.println("�ȳ�!");
		break; // �׻� ���̽��ϳ� ���� break�ۼ�
	case 3:
		System.out.println("���α׷� ����");
		break; // �׻� ���̽��ϳ� ���� break�ۼ�
	default: // else�� ����. ���� ���̽��� �´� ���� ���� �� ����
		System.out.println("�̽��� ���� �߰�!");
		break; // �׻� ���̽��ϳ� ���� break�ۼ�

	}
	}

}




