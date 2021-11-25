package application;

public class booleanAndOr {

	public static void main(String[] args) {
		// && || 합쳐서 사용
		boolean isRaining = true; // 비가 오는가?
		boolean mightRain = false; // 우산을 가지고 있나?
		boolean takeUmbrella = true; // 우산을 쓰나?

		// 1
		if ((isRaining || mightRain) && takeUmbrella) {
			System.out.println("우산을 쓴다");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}

		// 2
		boolean rainCheck = isRaining || mightRain;

		if (rainCheck && takeUmbrella) {
			System.out.println("우산을 쓴다");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
	}

}
