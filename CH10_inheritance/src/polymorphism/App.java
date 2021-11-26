package polymorphism;

public class App {

	public static void main(String[] args) {
//		// ������ : �ڽ� Ŭ���� Ÿ���� �θ�Ÿ������ �� ��ȯ
//		Cat cat1 = new Cat();
//		Cat cat2 = new HouseCat();
//		Cat cat3 = new RoadCat();
//
//		Cat[] cats = { cat1, cat2, cat3 };
//
//		for (Cat c : cats) { // cats�迭�� ������ ��ü�� C�� �����Ͽ� �ݺ�
//			c.vocal();
//			c.hunt();
//		}
//

		Cat[] cats = {new HouseCat(), new RoadCat(), new Tiger() };
		//cats[0] == new HouseCat();
		//cats[1] == new HouseCat();
		//cats[2] == new HouseCat();
		
		// String[] s = {new String("���ڿ�1"),new String("���ڿ�2"),new String("���ڿ�3")};
		
		// for �ݺ���
		for (int i =0; i< cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		// for each �ݺ���
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// ĳ���� ����ȯ(�⺻ ������ Ÿ��)
		int a = (int)1.2345;
		System.out.println(a);
		
		// ������ Ÿ��
		Cat cat1 = new HouseCat();  // ��ĳ����
		HouseCat cat2 = (HouseCat)cat1; // �ٿ�ĳ����
	}
}
