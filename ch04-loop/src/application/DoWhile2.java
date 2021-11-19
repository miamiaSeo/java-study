package application;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
//		// Do While은 처음 한번은 조건과 상관없이 실행 됨.
//		int count = 1; // 100으로 해도 실행 됨(do while문은 조건이 맞지않아도 한번은 실행이 됨)
//		
//		System.out.println("do while 반복문");
//		
//		do {
//			System.out.println("카운트 : " + count);
//		} while(count++ < 5);

		final String USER_PASSWORD = "Hello";

		Scanner scanner = new Scanner(System.in);

		String password = ""; // 문자열 선언과 초기값을 공백으로(null)

		do {
			System.out.println("비번을 입력 > ");
			password = scanner.nextLine(); // String password 여기에 쓰면 지역변수로 선언되어서 안됨 밖에서 선언해줘야함.21번 라인에 선언할게!
		} while (password.equals(USER_PASSWORD) == false); // or while(password == USER_PASSWORD); 
															// !true == false 이고 !false == true 이다
		System.out.println("접속승인!");

		scanner.close();

	}

}
