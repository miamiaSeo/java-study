package instance_of;

import java.io.Serializable;

class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
}

class Cat extends Creature{
	private static final long serialVersionUID = 1L;
}
	
public class App {

	public static void main(String[] args) {
		// instance of : ��ü Ÿ���� �Ǻ��ؼ� Ŭ������ ��ü�� ������ true �ƴϸ� false
		Creature c1 = new Creature();
		Object c2 = c1;
		
		Cat c3 = new Cat();
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c4 instanceof Object); // object�� �θ�Ŭ�����Ƿ� ��ü�� ����
		System.out.println(c4 instanceof Serializable); // �������̽��� ���������Ƿ� ��ü�� ����
		System.out.println(c4 instanceof Creature); // ���� Ŭ����
		System.out.println(c4 instanceof Cat);

	}

}
