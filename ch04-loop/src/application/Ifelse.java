package application;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		System.out.println(" 1.Hello! \n 2.안녕 \n 3.프로그램종료");

		Scanner scanner = new Scanner(System.in);

		System.out.println("=================");

		System.out.println("옵션을 선택 >");
		int numb = scanner.nextInt();

		if (numb == 1) {
			System.out.println("hello~!");
		}

		else if (numb == 2) {
			System.out.println("안녕!");
		}

		else if (numb == 3) {
			System.out.println("프로그램 종료");
		}

		else {
			System.out.println("이스터 에그를 발견했습니다!");
		}
//		System.out.println("프로그램 종료");

	}

}
