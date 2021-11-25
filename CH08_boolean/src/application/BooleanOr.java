package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘 중에 하나라도 참이면 참
		boolean isRaining = false; // 비가 오는가?
		boolean mightRain = true; // 우산을 가지고 있나?
		boolean takeUmbrella = false; // 우산을 쓰나?

		takeUmbrella = isRaining || mightRain;

		System.out.println(takeUmbrella);

	}

}
