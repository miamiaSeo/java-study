package timer_example3;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.TimerTask;

class Task1 extends TimerTask{
	@Override
	public void run() {
		System.out.println("Ÿ�̸�1 ��ο�~!");
		}
}

class Task2 implements Runnable{

	@Override
	public void run() { //Runnable�� �߻�޼ҵ带 ����(�ϼ�)�Ѵ�.
		// �� ���� �ڵ带 ���´�.
		System.out.println("Ÿ�̸�2 ���!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// Ÿ�̸�1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0L, 1000L);	
		
		
		
		// Ÿ�̸�2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleWithFixedDelay(new Task2(), 0, 1, TimeUnit.SECONDS); //�����̽ð�0, 1�ʿ� �ѹ��� �ݺ�, 


	}

}






