package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 Break; 사용시 빠져나옴
		int count = 0;
		
		while(true) { // 무한반복
			System.out.println("Hello~!" + count);
			
			if(count == 5) {
				break;
			}
			System.out.println("How are you?");
			
			count++;
		}
		System.out.println("종료");

	}

}
