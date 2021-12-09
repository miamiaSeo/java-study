package hashSet_union_intersection; //������(union), ������(intersection)

import java.util.HashSet;
import java.util.Objects;

public class App {
	public static void main(String[] args) {
		HashSet<String> list1 = new HashSet<>();
		list1.add("���");
		list1.add("��");
		list1.add("����");
		list1.add("����");
				
		HashSet<String> list2 = new HashSet<>();
		list2.add("ü��");
		list2.add("��");
		list2.add("���");
		list2.add("������");
		
		HashSet<String> union = new HashSet<>(list1); // ó�� ������ ����Ʈ1�� �Է��� ����
		union.addAll(list2); // ����Ʈ1 + ����Ʈ2 (�ߺ��������� ����(��, ���))
		
		union.forEach(System.out::println);
		System.out.println();
		
		HashSet<String> intersection = new HashSet<>(list1); // ������
		
		intersection.retainAll(list2); // ����Ʈ2�� �ߺ��Ǵ� �͵鸸 ����(��, ���)
		
		intersection.forEach(System.out::println);
				
		

	}

}
