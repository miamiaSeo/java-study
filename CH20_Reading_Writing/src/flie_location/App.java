package flie_location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// ������ ��ġ
		String fileLocation = "C:\\java502\\JAVA\\JAVA-study\\CH20_Reading_Writing\\text.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ����, �޼ҵ� exist�� ������ ������ true, ������ false ����
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){ 
			//BufferedReader��Buffer�� ����� �ѹ��� �������� ���� �� �ִ�. �Է��� FileReader���� ���
			String line = null;
			while ((line = reader.readLine()) != null) { //������ ���� ���̻� ���ڰ� ������ null
				System.out.println(line); // ���̻� ���� ���� ���������� �о ���� �� ����Ѵ�.
			}
		} catch (FileNotFoundException e) {
			// ���� ������ �� ã���� ���
			// e.printStackTrace(); ������ ����ó��
			System.out.println("������ ã�� ���� :" + fileLocation);
		}		 catch (IOException e) {
			// ������ ���� ���� ����
			// e.printStackTrace(); ������ ����ó��
			System.out.println("������ ���� ���� :" + fileLocation);		
	}
		

}
}
