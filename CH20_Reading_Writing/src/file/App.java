package file;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체를 만들기
		File currentDirectory = new File("."); // "." ← 현재 폴더 위치로 객체 생성
//		File currentDirectory = new File("text.txt"); // "." ← 현재 폴더 위치로 객체 생성
		
		System.out.println(currentDirectory.getAbsolutePath()); // 파일의 절대경로로 출력
		System.out.println(currentDirectory.getCanonicalPath()); // 파일의 절대경로로 출력
		
		// 폴더 내부 파일들을 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
		

	}

}
