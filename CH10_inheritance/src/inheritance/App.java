package inheritance;

public class App {

	public static void main(String[] args) {
		// ���� Ŭ������ �޼ҵ� eat()
		Animal ani = new Animal();
		ani.eat();

		// �� Ŭ������ �޼ҵ� fly()
		Bird bird = new Bird();
		bird.eat(); // ��ӹ���
		bird.fly();

	}

}
