package game.objects;

public class GameObject {
	private int id; // ���̵�
	private String name; // �̸�
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override  //���� object��  toString �޼ҵ�� �ּҰ��� ��Ÿ���µ� �޼ҵ� �������̵�
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	

	

}
