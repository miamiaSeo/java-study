package application;

public class PreAndPost {

	public static void main(String[] args) {
		// ���������� ++ -- ��ġ�� ���� ���
		// �ڿ� ���� ��� ���� ����ϰ� ����, �տ� ������� ���� �����ϰ� ���
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		int sum = x + z++;
		
		System.out.println(sum);
		
		int apples = 5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		
		System.out.println(fruits);
	}

}
