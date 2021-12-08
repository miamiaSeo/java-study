package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>();
		double total = 0;
		while (true) {
			System.out.print("���� �Ǵ� 'q' �Է� > ");
			String input = scanner.nextLine();
			input = input.trim(); // ��������
			// System.out.println(input);
			if (input.equalsIgnoreCase("q")) { // �Է��� q,Q�� �ϸ� �ݺ��� ����
				break;
			}
			try {
				double value = Double.parseDouble(input); // ���ڿ� => �Ǽ��� ��ȯ
				numbers.add(value); // �Ǽ��� ��ȯ�� ���� ����Ʈ�� �Է�
				total += value;
			} catch (NumberFormatException e) {
				System.out.println("���ڰ� �ƴմϴ�.");
			}

		}
		scanner.close(); // ��ĳ�� ����
		System.out.println();
		if (numbers.size() > 0) { // �Էµ� ���ڰ� 1�� �̻��̸� ���
			System.out.println("�Էµ� ���� : ");
			for (Double num : numbers) {
				System.out.printf("%.2f\n", num);
			}
			System.out.println();
			System.out.print("�� �� �� : " + total / numbers.size());
		} else {
			System.out.println("���ڰ� �Էµ��� ����!");
		}

	}
}
