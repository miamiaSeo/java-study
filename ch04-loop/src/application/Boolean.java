package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은 참, 거짓(true, false)
		boolean c1 = false;
		System.out.println("조건1: " + c1);
		
		// 비교 결과가 참, 거짓
		boolean c2 = 4 < 5;
		System.out.println("조건2: "+c2);
		
		// 비교 == 결과가 같을 때 참or거짓, != 같지 않을때 참or거짓 
		boolean c3 = 4 != 5;
		System.out.println("조건3: "+c3);
		System.out.printf("조건3: %b"+c3); // 불린은 %b로 printf에 사용

		
	}

}
