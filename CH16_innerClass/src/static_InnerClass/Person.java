package static_InnerClass;

public class Person {
	class Head{
		public void print() {
			System.out.println("���");
		}
	}
	static class Body{
		public void print() {
			System.out.println("�ٵ�");
		}
	}
	public void print() {
		Head head = new Head();
		Body body = new Body();
		// ���� Ŭ������ Ŭ���� �ȿ��� ��ü�� ����� ����ϸ� ���� ���
		head.print();
		body.print();
	}

}
