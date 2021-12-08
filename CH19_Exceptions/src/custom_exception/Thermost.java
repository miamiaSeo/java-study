package custom_exception;

import custom_exception.ex.TempOutOfRangeException;
import custom_exception.ex.TemperTooHighException;
import custom_exception.ex.TemperTooLowException;

public class Thermost {
	// ����ó�� throw�� �ش� ����ó���� �� �޼ҵ带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) throws TempOutOfRangeException{ 
		
		setTempOutOfRangeException(temperature);
		
		System.out.println("�µ� ���� : " + temperature);
}

		
	 private void setTempOutOfRangeException(double temperature) throws TempOutOfRangeException{
		 if(temperature < 0 ) {
			 throw new TemperTooLowException("�µ��� �ʹ� �����ϴ�.");
		 }
		 else if(temperature > 35) {
			 throw new TemperTooHighException("�µ��� �ʹ� �����ϴ�.");
	
		 }
 }
		
}			



// TempTonHightException, TempTooLowExceptio