package timer_example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{

	@Override
	public void run() { //Runnable�� �߻�޼ҵ带 ����(�ϼ�)�Ѵ�.
		// �� ���� �ڵ带 ���´�.
		System.out.println("��ο�~!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// Ÿ�̸�2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleWithFixedDelay(new Task(), 0, 1, TimeUnit.SECONDS); //�����̽ð�0, 1�ʿ� �ѹ��� �ݺ�, 

	}

}
