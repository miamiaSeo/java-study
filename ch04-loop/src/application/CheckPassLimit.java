package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
		// �н����尡 ������ '���ӽ���' ����ϰ� �ݺ����� ��������
		// �н����� 3ȸ Ʋ�� �� '���Ӱź�'

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false; // flag: �Ҹ������� ���¿� ���� ó���帧 ����

		// ���⿡ �ڵ� �ۼ� ����� ������ accessOK = true;�� �ϰ� "���ӽ���"�� ���

		String password = "";
		int count = 0;

		do {
			System.out.println("����� �Է� > ");
			password = scanner.nextLine();
			if (count >= 2) {
				System.out.println("���Ӱź�");
				break;
			}
			count++;
		} while (password.equals(USER_PASSWORD) == false);
		
		if(password.equals(USER_PASSWORD)){
			System.out.println("���ӽ���!");
		}

		scanner.close();

//		if(!accessOK) {
//			System.out.println("���Ӱź�");
//		}

	}

}
