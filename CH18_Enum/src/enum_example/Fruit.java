package enum_example;

public enum Fruit { // keyword�� enum
	APPLE("�ʷϻ�"), BANANA("�����"), ORANGE("��Ȳ��"); //������� ����(0, 1, 2)�ε��� ��ȣ
	
	private String color;
	
	Fruit(String color){
		this.color = color;
	}
	public String toString() {
		return super.toString().toLowerCase()+"("+color+")";
	}

}
