package application;

public class booleanAndOr {

	public static void main(String[] args) {
		// && || ���ļ� ���
		boolean isRaining = true; // �� ���°�?
		boolean mightRain = false; // ����� ������ �ֳ�?
		boolean takeUmbrella = true; // ����� ����?

		// 1
		if ((isRaining || mightRain) && takeUmbrella) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}

		// 2
		boolean rainCheck = isRaining || mightRain;

		if (rainCheck && takeUmbrella) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}
	}

}
