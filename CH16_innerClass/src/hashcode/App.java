package hashcode;
// objectŬ������ ���ǵ� hashCode�� ��ü�� �ּҰ��� 
// �̿��ؼ� �ؽ��ڵ带 ����� ��ȯ�ϱ� ������ ���δٸ� �� ��ü�� ���� �ؽ��ڵ带 ���� �� ����.

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		System.out.println(fox1.hashCode());
		System.out.printf("%x \n", fox1.hashCode());
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);
	}

}
