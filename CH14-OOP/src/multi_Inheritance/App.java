package multi_Inheritance;

interface Speaker{
	void speak(); //�߻�޼ҵ�
}
interface Greeter{
	void greet();
}

public class App {

	public static void main(String[] args) {
		// �������̽��� ���� ������ ����
		
		Person p1 = new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
		//p2.greet(); Speaker �������̽��� �߻�޼ҵ常 ��밡��
		
		Greeter p3 = new Person();
		p3.greet();
		//p3.speak(); Greeter �������̽��� �߻�޼ҵ常 ��밡��
		
		

	}

}