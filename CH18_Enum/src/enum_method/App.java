package enum_method;

public class App {

	public static void main(String[] args) {
		//values()
		Fruit[] fruits = Fruit.values();
		
		for(Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		
		//ordinal() : 순서(인덱스번호)를 리턴
		System.out.println(Fruit.BANANA.ordinal());
		
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		
//		System.out.println(Fruit.APPLE);
//		System.out.println(Fruit.BANANA);
//		System.out.println(Fruit.ORANGE);


	}

}
