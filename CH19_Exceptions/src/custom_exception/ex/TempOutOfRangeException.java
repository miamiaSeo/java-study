package custom_exception.ex;

public class TempOutOfRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {
		super(message); // 입력된 메세지로 새 예외 객체 생성
	}

}
