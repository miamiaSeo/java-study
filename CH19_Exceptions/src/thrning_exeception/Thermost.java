package thrning_exeception;

public class Thermost {
	// ����ó�� throw�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature > 35) {
			throw new Exception("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
		System.out.println("�µ� ���� : " + temperature);
	}
}
