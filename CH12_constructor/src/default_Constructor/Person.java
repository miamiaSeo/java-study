package default_Constructor;

public class Person {

	public String name;
	private int age;
	
	public Person() {
		System.out.println("����Ʈ �����ڷ� ������");
		name = "��";
		age = 0;
	}
	
	public Person(String name) { //�����ڴ� Ŭ����
		System.out.println("�� person�� ������");
		this.name = name;
		age = 0;
	}
	
	public Person(String name, int age) { //�����ڴ� Ŭ����
		System.out.println("�� person�� ������");
		this.name = name;
		this.age = 0;
	}
	@Override
	public String toString() { // ��ü�� ������ ���
	 	return "Person [name=" + name + ", age=" +"]";
	}

}
