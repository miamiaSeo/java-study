package application;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
//		// Do While�� ó�� �ѹ��� ���ǰ� ������� ���� ��.
//		int count = 1; // 100���� �ص� ���� ��(do while���� ������ �����ʾƵ� �ѹ��� ������ ��)
//		
//		System.out.println("do while �ݺ���");
//		
//		do {
//			System.out.println("ī��Ʈ : " + count);
//		} while(count++ < 5);

		final String USER_PASSWORD = "Hello";

		Scanner scanner = new Scanner(System.in);

		String password = ""; // ���ڿ� ����� �ʱⰪ�� ��������(null)

		do {
			System.out.println("����� �Է� > ");
			password = scanner.nextLine(); // password�� ���������� ����Ǿ �׳� ���°� �Ұ� �ۿ��� �ѹ��� �����������.21�� ���ο� �����Ұ�!
		} while (password.equals(USER_PASSWORD) == false); // or while(password == USER_PASSWORD); / !true == false �̰�
															// !false == true �̴�

		System.out.println("���ӽ���!");

		scanner.close();

	}

}
