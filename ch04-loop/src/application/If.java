package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� ������?");
		int apple = scanner.nextInt(); 
		
		System.out.println("�ٳ����� ������?");
		int banana = scanner.nextInt();
		
		if (apple > banana) {
			System.out.println("����� �ٳ������� ����");
		}
		if (banana > apple) {
			System.out.println("�ٳ����� ������� ����");
		}
		System.out.println("���α׷� ����");


		
		// If ���ǹ�
//		int apple = scanner.nextInt();
//		int banana = 10;
//		
		// if�� ������ ���� ��쿡 {}���� ��ɹ��� �����Ѵ�.
//		if(apple>banana) {
//			System.out.println("����� �ٳ������� ����");
//		}
//		System.out.println("���α׷� ����");
		

	}

}
