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
//		System.out.println("계란 삶는 중!");
//	}
//}
//
//class Task2 implements Runnable{
//	@Override
//	public void run() {
//	System.out.println("계란 삶기 완료!");
//}
//
//public class App {
//
//	public static void main(String[] args) {		
//		// 1. 5초간격 타이머 "계란 삶는 중"
//		Timer timer = new Timer();		
//		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);	
//		
//		
//		// 2. 30초 간격 타이머 "계란 삶기 완료"	
//		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//		
//		executor.scheduleWithFixedDelay(new Task2(), 30, 30, TimeUnit.SECONDS); //딜레이시간0, 1초에 한번씩 반복, 
//
//		JOptionPane.showMessageDialog(null,"계란 삶기 완료");
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
		System.out.println("계란 삶는 중!");
		}
}

class Task2 implements Runnable{

	@Override
	public void run() { //Runnable의 추상메소드를 구현(완성)한다.
		// 할 일의 코드를 적는다.
		JOptionPane.showMessageDialog(null,"계란 삶기 완료");
		//System.out.println("계란 삶기 완료!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 타이머1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L);	
		
		
		
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleWithFixedDelay(new Task2(), 30, 30, TimeUnit.SECONDS); //딜레이시간0, 1초에 한번씩 반복, 

	

	}

}





