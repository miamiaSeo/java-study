package reading_lineByline;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\java502\\JAVA\\JAVA-study\\CH20_Reading_Writing\\text.txt";
		// 위의 파일 주소로 파일객체 생성, 메소드 exist는 파일이 있으면 true, 없으면 false 리턴
		System.out.println(new File(fileLocation).exists());
	}

}
