package convertingTemp;

public class App {

	public static void main(String[] args) {
		// ���� �µ��� ȭ�� �µ��� ��ȯ (0��C �� 9/5) + 32 = 32��F

		double c = 25; // ���� ���� c �ʱⰪ�� 25
		double f = (c * 9/5) + 32; //ȭ�� ���� f�� ���Ĵ��
		
		System.out.println("����"+c+"�� ȭ��"+f+"�̴�");
	}

}
