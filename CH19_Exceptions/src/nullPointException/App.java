package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// ������Ʈ ���ܴ� RuntimeException���� ����ó�� ���ص� ��
		
		//��Ÿ�� ����
		System.out.println(5/0);
		
		//������Ʈ ����, ��ü�� �� ���ε� ����� ���
		Scanner scanner = null; // ��ü�� ���� �� ��
		scanner.nextInt();

	}

}
