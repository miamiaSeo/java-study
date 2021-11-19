package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져나옴
		// 패스워드 3회 틀릴 시 '접속거부'

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false; // flag: 불린변수로 상태에 따라 처리흐름 제어

		// 여기에 코드 작성 비번이 맞으면 accessOK = true;로 하고 "접속승인"을 출력

		String password = "";
		int count = 0;

		do {
			System.out.println("비번을 입력 > ");
			password = scanner.nextLine();
			if (count >= 2) {
				System.out.println("접속거부");
				break;
			}
			count++;
		} while (password.equals(USER_PASSWORD) == false);
		
		if(password.equals(USER_PASSWORD)){
			System.out.println("접속승인!");
		}

		scanner.close();

//		if(!accessOK) {
//			System.out.println("접속거부");
//		}

	}

}
