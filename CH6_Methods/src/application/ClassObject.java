package application;

// �ϳ��� ���Ͽ� �������� Ŭ������ ���� �� �ִ�.
class Person {
	String name;
}
// public class�� �� ���Ͽ� �ϳ��� ��������, ���� �̸��� ����
public class ClassObject{
	public static void main(String[] args) {
		// Ŭ������ ��ü
		// Ŭ������ ���赵�̰� ���� ��밡���� ��ü�� ����(��ü�� ���� �޸𸮿� ������ = �ν��Ͻ�)
		Person p1 = null;  // �������� �޽� Ŭ����Ÿ�� p1 ����, �ʱⰪ ����
		System.out.println(p1);
		p1 = new Person(); // Person�� ���� ��ü�� �����Ͽ� �� �ּҰ��� p1�� ����
		System.out.println(p1);
		
		p1.name ="���";
		
		Person p2 = new Person();
		p2.name ="�浿";
		Person p3 = new Person();
		p3.name ="���̿�";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}
	
}
