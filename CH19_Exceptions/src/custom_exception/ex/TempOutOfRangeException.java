package custom_exception.ex;

public class TempOutOfRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String message) {
		super(message); // �Էµ� �޼����� �� ���� ��ü ����
	}

}
