package application;

public class App {

	public static void main(String[] args) {
		// ����ƽ ������ Ŭ������.������ ��ü �������� ���
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);

		System.out.println(Cat.count);

		Cat cat1 = new Cat("��ƿ��");
		System.out.println(cat1.getCount());
		Cat cat2 = new Cat("���̾�");
		System.out.println(cat2.getCount());

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());

		Cat cat3 = new Cat("�����");
		System.out.println(Cat.getCount());
		System.out.println(cat3.toString());

	}

}

