package throwing_exeception2;

public class Thermost {
	// ����ó�� throw�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) throws Exception {

		setMachineTemperature(temperature);

		System.out.println("�µ� ���� : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws Exception {	
		if(temperature < 0 || temperature > 35) {
			throw new Exception("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
	}
}
