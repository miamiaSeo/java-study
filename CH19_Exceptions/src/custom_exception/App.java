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
			// �µ��� ���� ��
			System.out.println(e.getMessage());
		} catch(TemperTooLowException e) {
			// �µ��� ���� ��
			System.out.println(e.getMessage());
		}			
	}
}
