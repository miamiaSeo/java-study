package application;

public class NewArray {

	public static void main(String[] args) {
		// new Ű����� �迭�� �����Ѵ�.
		// int[] n = {1,2,3}; �ʱⰪ�� �ٷ� �ִ� �� ���ͷ��̶�� �Ѵ�.
		int[] numbers; // ������ �迭 numbers ����
		numbers = new int[3]; // ������ 3���� �迭�� ���� (3��¥�� �迭�� �������!)

		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;

		int total = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "  ");
			total = total + numbers[i]; // ��� �迭�� ���� ����
		}
		System.out.println("�� �հ�� :" + total);

	}

}
