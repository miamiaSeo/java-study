package application;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		System.out.println(" 1.Hello! \n 2.�ȳ� \n 3.���α׷�����");

		Scanner scanner = new Scanner(System.in);

		System.out.println("=================");

		System.out.println("�ɼ��� ���� >");
		int numb = scanner.nextInt();

		if (numb == 1) {
			System.out.println("hello~!");
		}

		else if (numb == 2) {
			System.out.println("�ȳ�!");
		}

		else if (numb == 3) {
			System.out.println("���α׷� ����");
		}

		else {
			System.out.println("�̽��� ���׸� �߰��߽��ϴ�!");
		}
//		System.out.println("���α׷� ����");

	}

}
