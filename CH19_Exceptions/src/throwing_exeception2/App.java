package throwing_exeception2;

public class App {

	public static void main(String[] args) throws Exception {
		Thermost stat = new Thermost();
		try {
		stat.setTemperature(36);
	} catch (Exception e) {
		//온도 예외 발생
		// e.printStackTrace();
		System.out.println("온도가 비정상 입니다.");
	}

	}
}
