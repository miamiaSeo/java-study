package application;

public class Break {

	public static void main(String[] args) {
		// �ݺ��� �ȿ��� Break; ���� ��������
		int count = 0;
		
		while(true) { // ���ѹݺ�
			System.out.println("Hello~!" + count);
			
			if(count == 5) {
				break;
			}
			System.out.println("How are you?");
			
			count++;
		}
		System.out.println("����");

	}

}
