package windowProgramaing;

public class App {

	public static void main(String[] args) {
		// ������ ��ü�� ����
		// set �޼ҵ�� ���� �Է��ϰ� get�޼ҵ�� ���� ����϶�
		// ���� ������â�� ���� 300 ���� 600
		//���� ���̵��� true, top 200, left 400
		Window window = new Window();
	
		window.setWidth(300);
		window.setHeight(600);
		window.setIsvisible(true);
		window.setTop(200);
		window.setLeft(400);
		
		System.out.println("���α��� : " + window.getWidth());
		System.out.println(window.getHeight());
		System.out.println(window.getIsvisible());
		System.out.println(window.getTop());
		System.out.println(window.getLeft());
	}

}
