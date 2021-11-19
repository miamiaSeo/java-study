package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// Switch문 문자 입력
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("계속 진행하시겠습니까?");
		
		String input = scanner.nextLine(); // 문자열 입력시 nextLine()
		scanner.close();
		
	
		switch (input) {
		case "y":
			System.out.println("계속 진행합니다.");
			break; // 항상 케이스하나 끝에 break작성
		case "n":
			System.out.println("종료합니다.");
			break; // 항상 케이스하나 끝에 break작성
		default: // else와 같음. 위의 케이스에 맞는 것이 없을 때 실행
			System.out.println("잘못된 입력입니다.");
			break; 

		}

	}

}
