package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		//������Ʈpretected ���������� ���� �ٸ� ��Ű������ ����� �� ���� ��ӹ��� �ڽ�Ŭ�������� ��밡��
		Fruit f1 = new Apple();
		//f1.id=7;
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		//f1.id=7;
		System.out.println(f2.toString());


	}

}
