package custom_exception.ex;

public class TemperTooLowException extends TempOutOfRangeException{
		private static final long serialVersionUID = 1L;
		
		public TemperTooLowException(String message) {
			super(message);
			// �Էµ� �޼���� �� ���� ��ü ����
		}
	}

