package anonymous;

public class App {

	private String name = "���";
	public static void main(String[] args) {
		// �͸�Ŭ������ �̸����� Ŭ����
		new App().start();
	}
	
	private void start() {
//		System.out.println(name);
//		Runnable �������̽��� ��ü�� ���� �� ������ 
//		�͸�Ŭ������ �ٷ� ����� �߻�޼ҵ带 �����Ͽ� ��밡��
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println(name);
			}
			
		};
		Runnable runner2 = new Runnable(){
				public void run() {
			System.out.println("��ο� "+name);
			}
		};
//		runner.run();
//		runner2.run();
//		activate(runner);
//		activate(runner2);
		
//		�Ű������� �������̽��� ��ü�� �Է��� ��� �͸�Ŭ������ �̿��� �ٷ� �ۼ�����
		activate(new Runnable() {
				public void run() {
					System.out.println(name);
				}
			});
			
	}
	
	public void activate(Runnable runnable) {
		runnable.run(); // �������̽��� �߻�޼��� ����
	}

}
