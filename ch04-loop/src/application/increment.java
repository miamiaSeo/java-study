package application;

public class increment {

	public static void main(String[] args) {
		// ���� ���� ������
		int count = 0;

		count = count + 1; // 1�� ����
		System.out.println(count);
		count += 1; // 1�� ����, c-=2 => c= c-2
		System.out.println(count);
		count++; // 1�� ����
		System.out.println(count);
		++count; // 1�� ����
		System.out.println(count);

		// ���� ���� 1�� ���� ���Ѷ�.

		count = count - 1; // 1�� ����
		System.out.println(count);
		count -= 1; // 1�� ����
		System.out.println(count);
		count--; // 1�� ����
		System.out.println(count);
		--count; // 1�� ����
		System.out.println(count);

	}

}
