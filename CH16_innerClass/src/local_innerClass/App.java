package local_innerClass;

public class App {
	
	private String name; // �ν��Ͻ� ����
	
	public App() {
		name = "�����ں���";
	}

	public static void main(String[] args) {
		// System.out.println(name); ���Ұ�
		App app = new App();
		//app.name = "���";
		app.run();
	}
	
	private void run() {
		//System.out.println(name);
		class Printer{
			public void print() {
				System.out.println(name);
			}
		}
		Printer p = new Printer();
		p.print();
		
		new Printer().print();
	}

}
