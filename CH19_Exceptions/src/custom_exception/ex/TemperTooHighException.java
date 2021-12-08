package custom_exception.ex;

public class TemperTooHighException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;
	
	public TemperTooHighException(String message) {
		super(message);
		// 입력된 메세기로 새 예외 객체 생성
	}
}


