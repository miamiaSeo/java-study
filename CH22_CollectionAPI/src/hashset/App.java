package hashset;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// �� Ÿ���� �ߺ��� �ȵǰ� ������ ����
		HashSet<String>	fruits = new HashSet<>();
		
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("��");
		fruits.add("���");
		fruits.add("���");
		
		System.out.println(fruits.contains("������"));
		
		for(String f : fruits) {
			System.out.println(f);
		}

	}

}
