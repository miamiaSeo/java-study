package this_Counstructor;

public class Person {

	public String name;
	private int age;
	
	public Person() {
		// this() �� �����ڸ� ����Ŵ
		this("�͸�",0);
	}
	
	public Person(String name) { //�����ڴ� Ŭ���� �̸��� ���� ���� Ÿ���� ����
		this(name,0);
	}
	
	public Person(String name, int age) { //�����ڴ� Ŭ���� �̸��� ���� ���� Ÿ���� ����
		this.name = name;
		this.age = 0;
	}
	@Override
	public String toString() { // ��ü�� ������ ���
	 	return "Person [�̸�=" + name + ", ����="+ age +"]";
	}

}
