package application;

import java.util.Scanner;

public class CheckPassLimit_bro {

   public static void main(String[] args) {
      // �н����尡 Ʋ������ 3�� �Է��� �� �ִ� ��ȸ�� �ش�.
      // �н����尡 ������ '���ӽ���' ����ϰ� �ݺ����� ��������
      // �н����� 3ȸ Ʋ�� �� '���Ӱź�'

      final String USER_PASSWORD = "hello"; // pass ����

      Scanner scanner = new Scanner(System.in);

      boolean accessOK = false; // flag: �Ҹ������� ���¿� ���� ó���帧 ���� / false�� true�� �����ص� ���� ���� true�� ��� 34�� ���ο��� "!"��

      // ���⿡ �ڵ� �ۼ� ����� ������ accessOK = true;�� �ϰ� "���ӽ���"�� ���

      String password = "";  //password�� null
      int count = 0; // 0���� ����

      do {
         System.out.println("����� �Է� > ");
         password = scanner.nextLine(); 
         if (password.equals(USER_PASSWORD) == true) {  // �Էµ� pass�� 12�� ���ΰ� ������ true
            accessOK = true;
            break;
         }
         count++;  // count�� �ϳ��� �ö�
      } while (count < 3); // count�� 3���� �۴� �� ����(0,1,2)
      scanner.close(); // �Է� �ø���

      if(!accessOK) {  //accessOK�� �ƴϸ� "���Ӱź�" 
         System.out.println("���Ӱź�");
      }else{		// �ƴϸ� "���ӽ���"
        System.out.println("���ӽ���");
      }

   }

}