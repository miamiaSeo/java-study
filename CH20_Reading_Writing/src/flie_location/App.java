package flie_location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일의 위치
		String fileLocation = "C:\\java502\\JAVA\\JAVA-study\\CH20_Reading_Writing\\text.txt";
		// 위의 파일 주소로 파일객체 생성, 메소드 exist는 파일이 있으면 true, 없으면 false 리턴
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){ 
			//BufferedReader→Buffer를 사용해 한번에 여러글자 읽을 수 있다. 입력은 FileReader등을 사용
			String line = null;
			while ((line = reader.readLine()) != null) { //파일의 끝에 더이상 무자가 없으면 null
				System.out.println(line); // 더이상 읽을 줄이 없을때까지 읽어서 한줄 씩 출력한다.
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우
			// e.printStackTrace(); 빨간색 예외처리
			System.out.println("파일을 찾지 못함 :" + fileLocation);
		}		 catch (IOException e) {
			// 파일을 읽지 못함 예외
			// e.printStackTrace(); 빨간색 예외처리
			System.out.println("파일을 읽지 못함 :" + fileLocation);		
	}
		

}
}
