package custom_exception;

import custom_exception.ex.TempOutOfRangeException;
import custom_exception.ex.TemperTooHighException;
import custom_exception.ex.TemperTooLowException;

public class App {
	public static void main(String[] args) { 
		Thermost stat = new Thermost();
	
		try {
			stat.setTemperature(36);
		} catch(TemperTooHighException e) {
			// 온도가 높을 때
			System.out.println(e.getMessage());
		} catch(TemperTooLowException e) {
			// 온도가 낮을 때
			System.out.println(e.getMessage());
		}			
	}
}
