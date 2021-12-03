package innerClasses;

public class App implements Runnable {

	private String name = "��Ű���콺";
	
	public static void main(String[] args) {
		new App().start();
		
	}
	
	private void start() {
		// activate �޼ҵ带 ����ؼ� �̳�Ŭ������� ������
		// 1. App�� �������̽� Runnable�� �����ؼ� ����
		activate(this);
		// 2. �͸�Ŭ����
		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
		// 3. �޼ҵ� �̳� Ŭ����
		class Runner1 implements Runnable{
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		
	}
}
