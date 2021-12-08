package file;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// ���� ��ü�� �����
		File currentDirectory = new File("."); // "." �� ���� ���� ��ġ�� ��ü ����
//		File currentDirectory = new File("text.txt"); // "." �� ���� ���� ��ġ�� ��ü ����
		
		System.out.println(currentDirectory.getAbsolutePath()); // ������ �����η� ���
		System.out.println(currentDirectory.getCanonicalPath()); // ������ �����η� ���
		
		// ���� ���� ���ϵ��� ���
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
		

	}

}
