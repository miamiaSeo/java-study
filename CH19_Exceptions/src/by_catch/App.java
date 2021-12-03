package by_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch ��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� : ");
		String line = scanner.nextLine();
		scanner.close();
		
		int number = 0;
		boolean isNumber = false;
		try { 
			number = Integer.parseInt(line);
			isNumber = true;
		} catch (NumberFormatException e) { // ���� �߻��� ���α׷� ���ᰡ �ƴ϶� ����� �̵�
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
			
		}
		if(isNumber) {
		System.out.println("�Է��� ���ڴ� : " + number);
		
		}

	}
}