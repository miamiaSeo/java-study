package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		Cat c1 = new Cat("��ƿ��");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("���̾�"));
		cats.add(new Cat("����Ŭ"));
		cats.add(new Cat("����"));
		
		cats.remove(1);
		cats.remove(c1);
		
		
		cats.forEach(System.out::println);

	}

}
