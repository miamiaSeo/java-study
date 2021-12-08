package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// ���� ��ü�� �����
		String text = "��ο�! \n �� �� �� �� �� ?"; // ���� ����
		
		Path path = Paths.get("C.\\JAVA\\text.txt"); 
		//������ ���(C:\java502\JAVA\JAVA-study\CH20_Reading_Writing
		
		//text.txt�� ���� text������ ����
		//FilesŬ������ ����ƽ �޼ҵ� write(���� ������ ���, ���� ����(byte����))
		Files.write(path, text.getBytes()); //������ ���� ��� ����.
		
		//�б�
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		

	}

}
