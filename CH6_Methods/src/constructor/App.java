package constructor;

public class App {

	public static void main(String[] args) {
		// ������ : Ŭ������ Ư���� �޼ҵ�
		Person p1 = new Person();
		//�⺻ �����ڴ� ��������
		p1.setName("���");
		p1.setHeight(120.0);
		Person p2 = new Person();
		p2.setName("����ġ");
		p2.setHeight(130.0);
		Person p3 = new Person();
//		p3.setName("���̾�");
//		p3.setHeight(140.0);
		
		System.out.printf("�̸� : %s, Ű: %.1f \n", p1.getName(), p1.getHeight());
		System.out.printf("�̸� : %s, Ű: %.1f \n", p2.getName(), p2.getHeight());
		System.out.printf("�̸� : %s, Ű: %.1f \n", p3.getName(), p3.getHeight());
	}

}
