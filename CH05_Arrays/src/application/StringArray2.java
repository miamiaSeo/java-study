package application;

public class StringArray2 {

	public static void main(String[] args) {
		// ���ڿ��� ���� �ڷ���, ���� ����(reference variable)�� �ּҰ��� ������.
		String text = null; // null���� �ּҰ��� ���ٴ� ��.
		// int x = null; �⺻ �ڷ������� null���� �ԷºҰ�.(null���� �ּҰ� ���ٴ� ��)
		// text = new String("��ο�");
		text = "Hello";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3]; // �迭 ���ڿ�3ĭ�� ���� �����ؼ� texts�� �ּ��Է�
		System.out.println(texts);
		System.out.println(texts[0]);
		
		texts[0] = new String("Hi!");
		texts[1] ="Hello"; 
		texts[2] = "Good bye!";
		
		for(String w : texts) {
			System.out.println(w);
		}
	}

}
