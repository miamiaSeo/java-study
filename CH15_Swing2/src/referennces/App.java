package referennces;

class Person {

public static class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();  // person ��ü ����! / p1�� ��ü�� ������ ��ġ �� �ּ�(address)�� ������.
		System.out.println(p1); // toString�������̵��� ������ ��� ��ü�� �ּҸ� ��Ÿ��(�ؽ��ڵ�)
		
		Person p2 = p1;			// �ּҸ� �ѱ�
		System.out.println(p2); // p1�� ���� ��
		
		test(p2);
	}
	
	private static void test(Person p) {
		System.out.println(p); // �Ű������� �Էµ� p�� �ּҸ� ���
	}

}
}
