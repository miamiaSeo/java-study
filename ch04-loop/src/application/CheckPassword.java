package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// ������ �н����� �Է½� '���ӽ���' �ƴϸ� '���ӺҰ�'
		final String USER_PASSWORD = "Hello";
		
		System.out.println("����� �Է� > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���ӽ���");
		}else {
			System.out.println("���ӺҰ�");
		}

	}

}
