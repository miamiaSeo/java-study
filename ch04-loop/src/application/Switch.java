package application;

public class Switch {

	public static void main(String[] args) {
		// Switch문
		int option = 10;

		switch (option) {
		case 0: // if랑 같은데 ==가 포함된거랑 같음. / 옵션변수 케이스 0과 같을 때!
			System.out.println("옵션 0 선택");
			System.out.println("케이스 0 일때");
			break; // 항상 케이스하나 끝에 break작성
		case 1:
			System.out.println("옵션 1 선택");
			break; // 항상 케이스하나 끝에 break작성
		case 10:
			System.out.println("프로그램 종료");
			break; // 항상 케이스하나 끝에 break작성
		default: // else와 같음. 위의 케이스에 맞는 것이 없을 때 실행
			System.out.println("잘못된 옵션번호");
			break; // 항상 케이스하나 끝에 break작성

		}

	}

}
