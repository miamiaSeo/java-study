package application;

public class DoWhile {

	public static void main(String[] args) {
		// Do While은 처음 한번은 조건과 상관없이 실행 됨.
		int count = 1; // 100으로 해도 실행 됨(do while문은 조건이 맞지않아도 한번은 실행이 됨)
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("카운트 : " + count);
		} while(count++ < 5);

	}

}
