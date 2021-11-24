package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체를 만들기
		studant s1 = new studant("펭수", 7);
		studant s2 = new studant("어피치", 27);
		studant s3 = new studant("라이언", 17);
		studant s4 = new studant("콘", 97);
		
		s1.setVisible(false);//펭수는 원격, 온도층정 안함
		s2.setTemperature(35.5); //어피치는 집체 온도 35.5
		s3.setTemperature(36.5); //라이언은 집체 온도 35.5
		s4.setVisible(false); // 콘도 원격

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
