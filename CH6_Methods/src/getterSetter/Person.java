package getterSetter;

public class Person {
	// private�� ���� Ŭ���������� ���� ����
	private String name;
	private int age;
	
	// public�� �ٸ� Ŭ�������� �� �� ����
	// set�� ���� �Է��ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name; // �� �� this�� �ν��Ͻ� �ǹ�
	}
	
	// get�޼ҵ�� ���� �����ϴ� �޼ҵ�
	public String getName() {
		return name;
	}
	// set get age�����
	
	public void setAge(int age) {
		System.out.println(this);
		this.age = age;
	}
	public int getAge() {
		System.out.println(this);
		return age;
	}
}
