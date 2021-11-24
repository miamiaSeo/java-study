package school;

public class studant {
		private String name;
		private int age;
		private boolean isVisible; //집체 true, 원격 false
		private double temperature;  //온도체크
		
				
		// 자동완성 기능으로 getter, setter 완성하기
		// alt + shift + S -> Generate Getter and Setter
		// 필요한거 check후 Generate.
		
		// 생성자
		public studant(String name, int age) {
			this.name = name;
			this.age = age;
			isVisible = true;
			temperature = 0;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;

		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public boolean isVisible() {
			return isVisible;
		}
		public void setVisible(boolean visible) {
			this.isVisible = visible;
		}
		public double getTemperature() {
			return temperature;
		}
		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}

		// toString 메소드
		
		@Override
		public String toString() {
			return "Studant [이름=" + name + ", 나이ㅣ=" + age + ", 집체=" + isVisible + ", 온도=" + temperature
					+ "]";
		}
						
	}

	




