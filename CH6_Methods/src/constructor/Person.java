package constructor;

public class Person {
	private String name;
	private double height;
	
	//public Person() {} //�⺻ ������ (��������)
	//������ �޼ҵ� : public + Ŭ������(), ����Ÿ�Ծ���
	public Person() {
		name = "�͸�";
		height = 180;
		System.out.println("�� ����� ����!");
	}
	// get set �޼ҵ�
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}


}
