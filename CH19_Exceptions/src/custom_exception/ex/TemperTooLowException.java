package custom_exception.ex;

public class TemperTooLowException extends TempOutOfRangeException{
		private static final long serialVersionUID = 1L;
		
		public TemperTooLowException(String message) {
			super(message);
			// 입력된 메세기로 새 예외 객체 생성
		}
	}

