package runtime_exception;

public class Thermost {
	// ����ó�� throw�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) {
		
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
		System.out.println("�µ� ���� : " + temperature);
	}
}
