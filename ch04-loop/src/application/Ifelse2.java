package application;

import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {

		System.out.println(" 1.Hello! \n 2.안녕 \n 3.프로그램종료");

		Scanner scanner = new Scanner(System.in);

		System.out.println("=================");

		System.out.println("옵션을 선택 >");
		int numb = scanner.nextInt();
	// Switch case 문으로 수정
	
	int option = 1;

	switch (option) {
	case 1: // if랑 같은데 ==가 포함된거랑 같음.
		System.out.println("Hello~!");
		System.out.println("");
		break; // 항상 케이스하나 끝에 break작성
	case 2:
		System.out.println("안녕!");
		break; // 항상 케이스하나 끝에 break작성
	case 3:
		System.out.println("프로그램 종료");
		break; // 항상 케이스하나 끝에 break작성
	default: // else와 같음. 위의 케이스에 맞는 것이 없을 때 실행
		System.out.println("이스터 에그 발견!");
		break; // 항상 케이스하나 끝에 break작성

	}
	}

}




