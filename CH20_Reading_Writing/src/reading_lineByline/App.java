package reading_lineByline;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// ������ ��ġ
		String fileLocation = "C:\\java502\\JAVA\\JAVA-study\\CH20_Reading_Writing\\text.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ����, �޼ҵ� exist�� ������ ������ true, ������ false ����
		System.out.println(new File(fileLocation).exists());
	}

}
