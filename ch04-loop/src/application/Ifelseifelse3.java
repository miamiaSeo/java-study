package application;

import java.util.Scanner;

public class Ifelseifelse3 {

	public static void main(String[] args) {
		// ifelse��
		
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

	}

}
