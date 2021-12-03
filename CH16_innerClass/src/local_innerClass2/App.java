package local_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	private String name; // �ν��Ͻ� ����
	
	public App() {
		name = "�����ں���";
	}

	public static void main(String[] args) {
		// System.out.println(name); ���Ұ�
		App app = new App();
		//app.name = "���";
		app.run();
	}
	
	private void run() {
		//System.out.println(name);
		class Printer implements Runnable{
			@Override
			public void run() {
				System.out.println(name);
			}
		}

		
		//new Printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(name);
			}
		}, 0L, 1L, TimeUnit.SECONDS);
	}

}
