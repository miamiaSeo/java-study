package casting;

public class App {

	public static void main(String[] args) {
		// �޼ҵ� �������̵�
		Cat cat1 = new HouseCat(); // ��ü�� �Ͽ콺Ĺ
		cat1.vocal();
		cat1.hunt();
		//	 cat1.call(); cat1�� CatŸ���̱� ������ CatŬ������ ���� �޼ҵ� ���Ұ�
		// �ٿ� ĳ����
		HouseCat cat2 = (HouseCat)cat1; // �����Ϸ��� ���� ǥ�ø� ������ �ʱ� ������ �ǽð� ���� �߻�
		cat2.call();
		

	}
}