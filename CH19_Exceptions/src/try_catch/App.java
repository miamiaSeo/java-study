package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch ��
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� �Է� : ");
		String line = scanner.nextLine();
		scanner.close(); // ��ĳ�� ����

		int number = 0;
		boolean isNumber = false;

		try { // ���ܰ� �߻��Ҽ� �ִ� �ڵ带 ����
			number = Integer.parseInt(line); // ���ڿ��� ������ ��ȯ
			isNumber = true;
		} catch (NumberFormatException e) { // ���� �߻��� ���α׷� ���ᰡ �ƴ϶� ����� �̵�
			System.out.println("������ ��ȯ�Ҽ� �����ϴ�.");
		}

		if (isNumber) {
			System.out.println("�Է��� ���ڴ� : " + number);
		}

	}

}