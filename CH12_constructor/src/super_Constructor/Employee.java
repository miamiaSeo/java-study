package super_Constructor;

public class Employee extends Person {
	public Employee() {
		super("�͸�"); // �θ�Ŭ������ ������
		System.out.println("Employee ������");
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee ������");
	}

}
