package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// ����Ʈ �������̽�
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		// ��̸���Ʈ
		list1.add(5);
		list1.add(7);
		list1.add(8);
		
		//��ũ�帮��Ʈ
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		displyList(list1); // �ֿܼ� �Էµ� ����Ʈ Ÿ�� ��ü�� �����۵��� ���
		System.out.println();
		displyList(list2); // �ֿܼ� �Էµ� ����Ʈ Ÿ�� ��ü�� �����۵��� ���
	
		
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		displyList(list3);
	}
	/**
	 * �Է� �� ����Ʈ Ÿ�� ��ü�� �����۵��� ���
	 * @param list
	 */

	private static void displyList(List<Integer> list) {
		// �Է� �� ����Ʈ Ÿ�� ��ü�� �����۵��� ���
		// list.forEach(System.out::println);
		for(int i : list) {
			System.out.println(i);
			
			
		}
		
	}

}
