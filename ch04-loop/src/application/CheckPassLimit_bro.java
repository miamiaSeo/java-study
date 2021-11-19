package application;

import java.util.Scanner;

public class CheckPassLimit_bro {

   public static void main(String[] args) {
      // 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
      // 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져나옴
      // 패스워드 3회 틀릴 시 '접속거부'

      final String USER_PASSWORD = "hello"; // pass 정함

      Scanner scanner = new Scanner(System.in);

      boolean accessOK = false; // flag: 불린변수로 상태에 따라 처리흐름 제어 / false도 true로 지정해도 노상관 단지 true일 경우 34번 라인에서 "!"땜

      // 여기에 코드 작성 비번이 맞으면 accessOK = true;로 하고 "접속승인"을 출력

      String password = "";  //password는 null
      int count = 0; // 0부터 시작

      do {
         System.out.println("비번을 입력 > ");
         password = scanner.nextLine(); 
         if (password.equals(USER_PASSWORD) == true) {  // 입력된 pass가 12번 라인과 같으면 true
            accessOK = true;
            break;
         }
         count++;  // count는 하나씩 올라감
      } while (count < 3); // count는 3보다 작다 총 세번(0,1,2)
      scanner.close(); // 입력 시마이

      if(!accessOK) {  //accessOK가 아니면 "접속거부" 
         System.out.println("접속거부");
      }else{		// 아니면 "접속승인"
        System.out.println("접속승인");
      }

   }

}