package list_interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// ��̸���Ʈ�� ��ũ�帮��Ʈ�� ���� �ð�
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration = timeOperations(linkedList);
		System.out.println("�����ð� : " + duration);
		//�Ϲ����� ������� �Է��� ��̸���Ʈ�� 2�� �� ����
		//Ư�� �ε��� ��ȣ�� �Է��̳� ���Ŵ� ��ũ�� ����Ʈ�� �ξ� ����
			
	}
	
	public static long timeOperations(List<Integer>list) {
		long start = System.currentTimeMillis(); // �ð�����
		
		for(int i=0; i< 100000; i++) {
			list.add(i); //0���� 10�� -1���� ����Ʈ�� �ϳ��� �Է�
		}
		
		return System.currentTimeMillis() - start; // ����ð� ����
	}

}


////�ð�üũ �ϴ� ��
//long time1 = System.currentTimeMillis(); // ���� �ð��� 1/1000�ʷ�
//System.out.println(time1);
//
//// ����Ʈ �����ϰ�
//for(int i=0; i<10000; i++) {
//	System.out.println(i);
//}
//long time2 = System.currentTimeMillis();
//System.out.println(time2 - time1); // �ɸ��ð�
