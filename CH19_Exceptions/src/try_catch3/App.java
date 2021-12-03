package try_catch3;

import java.util.Scanner;

public class App {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch ��

		int number = getNumber();
		System.out.println("�Է��� ���ڴ� : " + number);
		scanner.close();

	}

	private static int getNumber() { //���ڸ� �Է� �޾Ƽ� ����
		int number = 0;
		boolean isNumber = false;

		//���ڸ� �Է��Ҷ����� �ݺ� do while�� ���
		do {
			System.out.print("���ڸ� �Է� : ");
			String line = scanner.nextLine();

			try { // ���ܰ� �߻��Ҽ� �ִ� �ڵ带 ����
				number = Integer.parseInt(line); // ���ڿ��� ������ ��ȯ
				isNumber = true; //�����Էµ�
			} catch (NumberFormatException e) { // ���� �߻��� ���α׷� ���ᰡ �ƴ϶� ����� �̵�
				System.out.println("������ ��ȯ�Ҽ� �����ϴ�.");
			}

		} while (!isNumber);

		return number;
	}

}