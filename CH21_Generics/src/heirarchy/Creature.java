package heirarchy;

public class Creature {
	// �ʵ� ����, �ν��Ͻ� ���� 
	private String name;
	// ������
	
	public Creature(String name) {
		this.name =name;
	}
	// toString�޼ҵ� (��ü���� ��½� ����(����)
	public String toString() {
		return name;
	}
	// feed�޼ҵ�
	public void feed() {
		System.out.println("�Դ´� �ͱ��ͱ�!");
	}
}
