package abstract_Class;

public class App {

	public static void main(String[] args) {
		// �߻� Ŭ����
		// GameObject obj = new GameObject �� ���� �� ����
		GameObject[] objs = { new Player(), new Monster()};
		
		for(GameObject  ob : objs) {
			System.out.println(ob);
			ob.describe(); // ������ �߻� �޼ҵ�
		}

	}

}
