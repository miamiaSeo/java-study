package application;

public class StringArray {

	public static void main(String[] args) {
		// ���ڿ� Ÿ������ ���� �迭
		
		String[] animals = {"�����","��","�ر�","����","ȣ����"};
		/*
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
 		System.out.println(animals[3]);
 		*/
		// �ݺ��� for�� �ε��� ��ȣ�� i��, �迭.length�� �迭�� ������(ũ��)�� �˷��ش�.
		
		for(int i=0; i<4; i++) {        // i < animals.length;
			System.out.printf("�ε��� %d���� %s�� \n", i, animals[i]);
		}
		
 		
 		
 		
	}

}
