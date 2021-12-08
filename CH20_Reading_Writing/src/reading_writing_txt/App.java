package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체를 만들기
		String text = "헬로우! \n 하 우 아 유 우 ?"; // 적을 내용
		
		Path path = Paths.get("C.\\JAVA\\text.txt"); 
		//파일의 경로(C:\java502\JAVA\JAVA-study\CH20_Reading_Writing
		
		//text.txt에 위의 text내용을 적기
		//Files클래스의 스테틱 메소드 write(적을 파일의 경로, 적을 내용(byte단위))
		Files.write(path, text.getBytes()); //파일이 없을 경우 만듬.
		
		//읽기
		String recivedText = Files.readString(path);
		System.out.println(recivedText);
		

	}

}
