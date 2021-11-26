package overridingMethod;

public class RoadCat extends Cat {
	@Override 
	public void vocal() { // 오버라이딩 메소드 : 자식클래스에서 부모와 똑같은 메소드 
		System.out.println("애용!");
		// 메소드 오버라이딩
//		Cat cat1 = new Cat();
//		cat1.vocal();
//		
//		HouseCat cat2 = new HouseCat();
//		cat2.vocal();
//		
//		RoadCat cat3 = new RoadCat();
//		cat3.vocal();
	}
	


	

}
