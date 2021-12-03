package timer_example3;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.util.TimerTask;

class Task1 extends TimerTask{
	@Override
	public void run() {
		System.out.println("타이머1 헬로우~!");
		}
}

class Task2 implements Runnable{

	@Override
	public void run() { //Runnable의 추상메소드를 구현(완성)한다.
		// 할 일의 코드를 적는다.
		System.out.println("타이머2 헬로!");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 타이머1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0L, 1000L);	
		
		
		
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleWithFixedDelay(new Task2(), 0, 1, TimeUnit.SECONDS); //딜레이시간0, 1초에 한번씩 반복, 


	}

}






