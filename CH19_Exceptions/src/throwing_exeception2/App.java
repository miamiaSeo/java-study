package throwing_exeception2;

public class App {

	public static void main(String[] args) throws Exception {
		Thermost stat = new Thermost();
		try {
		stat.setTemperature(36);
	} catch (Exception e) {
		//�µ� ���� �߻�
		// e.printStackTrace();
		System.out.println("�µ��� ������ �Դϴ�.");
	}

	}
}
