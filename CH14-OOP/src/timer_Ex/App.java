//package timer_Ex;
//
//import java.util.Timer;
//import java.util.TimerTask;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//import javax.swing.JOptionPane;
//
//class Task1 extends TimerTask{
//	private int i = 0;
//	@Override
//	public void run() {
//		i += 1;
//		System.out.println("��� ��� ��!");
//	}
//}
//
//class Task2 implements Runnable{
//	@Override
//	public void run() {
//	System.out.println("��� ��� �Ϸ�!");
//}
//
//public class App {
//
//	public static void main(String[] args) {		
//		// 1. 5�ʰ��� Ÿ�̸� "��� ��� ��"
//		Timer timer = new Timer();		
//		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);	
//		
//		
//		// 2. 30�� ���� Ÿ�̸� "��� ��� �Ϸ�"	
//		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//		
//		executor.scheduleWithFixedDelay(new Task2(), 30, 30, TimeUnit.SECONDS); //�����̽ð�0, 1�ʿ� �ѹ��� �ݺ�, 
//
//		JOptionPane.showMessageDialog(null,"��� ��� �Ϸ�");
//
//	}
//
//}

package timer_Ex;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import java.util.TimerTask;

class Task1 extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i += 1;
		System.out.println("��� ��� ��!");
		}
}

class Task2 implements Runnable{

	@Override
	public void run() { //Runnable�� �߻�޼ҵ带 ����(�ϼ�)�Ѵ�.
		// �� ���� �ڵ带 ���´�.
		JOptionPane.showMessageDialog(null,"��� ��� �Ϸ�");
		//System.out.println("��� ��� �Ϸ�!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// Ÿ�̸�1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);	
		
		
		
		// Ÿ�̸�2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleWithFixedDelay(new Task2(), 30, 30, TimeUnit.SECONDS); //�����̽ð�0, 1�ʿ� �ѹ��� �ݺ�, 

	

	}

}





