package getterSetter;

public class App {

	public static void main(String[] args) {
		// �ν��Ͻ� ������ �����ϴ� �޼ҵ� get�� set
		Person p1 = new Person();
		// ���Ȼ� ��ü�� ������ �ٷ� �������� ����
		// p1.name = "���";
		p1.setName("���");
		System.out.println(p1.getName());		
		p1.setAge(20);
		System.out.println(p1.getAge());
		
		Person p2 = new Person();
		
		p2.setName("�浿");
		System.out.println(p2.getName());		
		p2.setAge(40);
		System.out.println(p2.getAge());

	}

}
