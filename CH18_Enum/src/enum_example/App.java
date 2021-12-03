package enum_example;

public class App {

	public static void main(String[] args) {
		
		Fruit[] fruits = Fruit.values(); // 이넘. values() => 배열로 리턴
		
		for( Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}
		// ordinal() : 이넘의 상수의 순서(인덱스 번호)
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		//valueOF("상수값") : 상수값과 같은 enum을 찾음
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);

	}

}
