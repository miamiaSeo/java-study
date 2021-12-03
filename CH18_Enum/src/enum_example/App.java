package enum_example;

public class App {

	public static void main(String[] args) {
		
		Fruit[] fruits = Fruit.values(); // �̳�. values() => �迭�� ����
		
		for( Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}
		// ordinal() : �̳��� ����� ����(�ε��� ��ȣ)
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		//valueOF("�����") : ������� ���� enum�� ã��
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);

	}

}
