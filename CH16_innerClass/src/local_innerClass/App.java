package local_innerClass;

public class App {
	
	private String name; // 인스턴스 변수
	
	public App() {
		name = "엘리자베스";
	}

	public static void main(String[] args) {
		// System.out.println(name); 사용불가
		App app = new App();
		//app.name = "펭수";
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
