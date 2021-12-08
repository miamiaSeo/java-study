package arrayList;

import java.util.ArrayList;

public class iterating {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(); // ����Ÿ�� ����Ʈ����
		// ����Ʈ�� ���� �߰�
		list.add(7);
		list.add(9);
		list.add(123);

		// �ݺ��� ��� for each�� : �����ϰ� ���
		for (int n : list) {
			System.out.println(n);
		}
		// for �ݺ��� : �ε��� ��ȣ�� �ʿ��Ҷ�!
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
		// �÷��ǰ�ü.forEach(���� �ݺ�), ���ٽ�
		list.forEach(e -> System.out.println(e));
		// �޼ҵ� ���۷���
		list.forEach(System.out::println);
	}

}