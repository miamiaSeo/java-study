package school;

public class studant {
		private String name;
		private int age;
		private boolean isVisible; //��ü true, ���� false
		private double temperature;  //�µ�üũ
		
				
		// �ڵ��ϼ� ������� getter, setter �ϼ��ϱ�
		// alt + shift + S -> Generate Getter and Setter
		// �ʿ��Ѱ� check�� Generate.
		
		// ������
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

		// toString �޼ҵ�
		
		@Override
		public String toString() {
			return "Studant [�̸�=" + name + ", ���̤�=" + age + ", ��ü=" + isVisible + ", �µ�=" + temperature
					+ "]";
		}
						
	}

	




