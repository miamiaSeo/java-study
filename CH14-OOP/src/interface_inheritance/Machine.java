package interface_inheritance;

public class Machine implements DefaultRunnable {
	
	@Override
	public void run() {
		System.out.println("�ӽŷ���!");
	}
	
	@Override
	public void displayDetails() {
		System.out.println("ǥ���� ������ ����");
	}
	
	

}
