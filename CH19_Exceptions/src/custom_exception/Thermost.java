package custom_exception;

import custom_exception.ex.TempOutOfRangeException;
import custom_exception.ex.TemperTooHighException;
import custom_exception.ex.TemperTooLowException;

public class Thermost {
	// 예외처리 throw는 해당 예외처리를 이 메소드를 호출할 때 처리하도록 함
	public void setTemperature(double temperature) throws TempOutOfRangeException{ 
		
		setTempOutOfRangeException(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
}

		
	 private void setTempOutOfRangeException(double temperature) throws TempOutOfRangeException{
		 if(temperature < 0 ) {
			 throw new TemperTooLowException("온도가 너무 낮습니다.");
		 }
		 else if(temperature > 35) {
			 throw new TemperTooHighException("온도가 너무 높습니다.");
	
		 }
 }
		
}			



// TempTonHightException, TempTooLowExceptio