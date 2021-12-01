package this_Counstructor;

public class Person {

	public String name;
	private int age;
	
	public Person() {
		// this() 는 생성자를 가리킴
		this("익명",0);
	}
	
	public Person(String name) { //생성자는 클래스 이름과 같고 리턴 타입이 없음
		this(name,0);
	}
	
	public Person(String name, int age) { //생성자는 클래스 이름과 같고 리턴 타입이 없음
		this.name = name;
		this.age = 0;
	}
	@Override
	public String toString() { // 객체의 정보를 출력
	 	return "Person [이름=" + name + ", 나이="+ age +"]";
	}

}
