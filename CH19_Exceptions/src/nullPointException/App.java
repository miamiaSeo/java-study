package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인트 예외는 RuntimeException으로 예외처리 안해도 됨
		
		//런타임 예외
		System.out.println(5/0);
		
		//널포인트 예외, 객체가 널 값인데 사용할 경우
		Scanner scanner = null; // 객체는 생성 안 됨
		scanner.nextInt();

	}

}
