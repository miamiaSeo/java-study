package application;

public class Cat {
	private String name; //�̸�
	private int id; // ���̵�(������ȣ, �ߺ��� �ȵ�)
	
	// ����ƽ ���
	public static final String FOOD = "����� ���";
	// ����ƽ ���� (��ü�鿡 ������)
	public static int count = 0; // �ʱⰪ 0
	
	public Cat(String name) {
		this.name = name;
		count++;
		id = count; // ��ü�� ������� ������ ī��Ʈ �����ϸ鼭 ����
	}
	
	public static int getCount() {
		// ����ƽ�޼ҵ�� �Ϲ� �ν��Ͻ�(��ü) ���� ���Ұ�
		// String s = name; ��ü�� ��������� ���� ��� �����ϹǷ�
		// �ν��Ͻ� ������ ����� ���� ����.
		return count; // ����ƽ ������ ��밡��
	}
	@Override
	public String toString() {
		return "Cat [name = " + name + "]";
	}

}
