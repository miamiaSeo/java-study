package application;

import java.util.Scanner;

public class Ifelseifelse3 {

	public static void main(String[] args) {
		// ifelse문
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 개수는?");
		int apple = scanner.nextInt(); 
		
		System.out.println("바나나의 개수는?");
		int banana = scanner.nextInt();
		
		if (apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		if (banana > apple) {
			System.out.println("바나나가 사과보다 많음");
		}
		System.out.println("프로그램 종료");

	}

}
