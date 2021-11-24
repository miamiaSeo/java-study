package exem1;

public class app {

	public static void main(String[] args) {
		// 1. 메뉴 객체 만들기 
		// 2. display() 메소드 사용해서 메뉴 출력하기
		System.out.println("메뉴를 선택");
		
		Menu menu = new Menu();
				
		menu.display();
	}

}
