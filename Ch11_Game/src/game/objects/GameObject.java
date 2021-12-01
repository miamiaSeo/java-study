package game.objects;

public class GameObject {
	private int id; // ���̵�
	private String name; // �̸�
	private int[][] comparison = {
			//				����		����		��
			/*����(0)*/ {		0,	   -1,		1	},	
			/*����(1)*/ {		1,		0,	   -1	},	
			/*��(2)*/  {	   -1,		1,		0	}	
	};
	// ����� (����,����,��)�� ���ؼ� ��� ����
	public int compareTo(GameObject ob) {
		return comparison[id][ob.id];
	}
	
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
