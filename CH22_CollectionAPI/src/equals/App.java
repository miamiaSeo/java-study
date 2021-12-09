package equals;

import java.util.Objects;

class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ��ü�� ���� ���
			return true;
		if (obj == null) // �񱳴���� �ΰ��̸�
			return false;
		if (getClass() != obj.getClass()) //Ŭ���� Ÿ���� �ٸ� ��� false
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name); // ���� 3���� ��찡 �ƴ� ��쿡 �̸����� 
	}
}

public class App {

	public static void main(String[] args) {
		// ������ ���ϴ� �޼ҵ�
		Person p1 = new Person("���");
		Person p2 = new Person("���");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
