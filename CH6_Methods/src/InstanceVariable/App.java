package InstanceVariable;

public class App {

	public static void main(String[] args) {
		// ���� ��Ű�� �ȿ� �ִ� Person Ŭ������ ����Ѵ�.
		// ��ĳ�ʸ� ����Ϸ��� ��ĳ�� Ŭ������ import �ؾ� ��
		Person p1 = new Person();
		p1.name = "���";
		p1.age  = 7;
		Person p2 = new Person();
		p2.name = "�浿";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		//Person.name = "ȫ�浿"; ���Ұ�

	}

}
