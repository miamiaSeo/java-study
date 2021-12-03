package referennces;

class Person {

public static class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();  // person 객체 생성! / p1은 객체가 생성된 위치 즉 주소(address)를 가진다.
		System.out.println(p1); // toString오버라이딩을 안했을 경우 객체의 주소를 나타냄(해쉬코드)
		
		Person p2 = p1;			// 주소를 넘김
		System.out.println(p2); // p1과 같은 값
		
		test(p2);
	}
	
	private static void test(Person p) {
		System.out.println(p); // 매개변수로 입력된 p의 주소를 출력
	}

}
}
