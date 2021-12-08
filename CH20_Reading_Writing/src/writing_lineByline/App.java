package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// ������ ��ġ
		String fileLocation = "C:\\java502\\JAVA\\JAVA-study\\CH20_Reading_Writing\\text.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ����, �޼ҵ� exist�� ������ ������ true, ������ false ����
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		// ���Ͼ���
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))){
			br.write("������");
			br.newLine();
			br.write("����");
			br.newLine();
			br.write("�ٳ���");
			br.newLine();
			br.write("��");
			br.newLine();
			
		} catch (IOException e) {
			// ������ �� �� ����
			System.out.println("������ �� �� ���� : " + fileLocation);
		}
	}

}
