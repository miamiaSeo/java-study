package school;

public class App {

	public static void main(String[] args) {
		// �л� ��ü�� �����
		studant s1 = new studant("���", 7);
		studant s2 = new studant("����ġ", 27);
		studant s3 = new studant("���̾�", 17);
		studant s4 = new studant("��", 97);
		
		s1.setVisible(false);//����� ����, �µ����� ����
		s2.setTemperature(35.5); //����ġ�� ��ü �µ� 35.5
		s3.setTemperature(36.5); //���̾��� ��ü �µ� 35.5
		s4.setVisible(false); // �ܵ� ����

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
