package custom_exception.ex;

public class TemperTooHighException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;
	
	public TemperTooHighException(String message) {
		super(message);
		// �Էµ� �޼���� �� ���� ��ü ����
	}
}


